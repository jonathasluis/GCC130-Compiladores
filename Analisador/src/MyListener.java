import antlr.GramaticaSintatica;
import antlr.GramaticaSintaticaBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends GramaticaSintaticaBaseListener {

    private final Map<String, String> tabelaSimbolos = new HashMap<>();
    private final Map<String, List<GramaticaSintatica.VariavelContext>> tabelaParametros = new HashMap<>();

    @Override
    public void exitElemento(GramaticaSintatica.ElementoContext ctx) {
        String id = (ctx.ID() != null ? ctx.ID().getText() : "");
        if (!id.isEmpty() && !tabelaSimbolos.containsKey(id)) {
            System.err.println("Não foi possivel encontrar o simbolo " + id);
            System.exit(0);
        }
    }

    @Override
    public void exitCallFunc(GramaticaSintatica.CallFuncContext ctx) {
        String id = (ctx.ID() != null ? ctx.ID().getText() : "");
        if (!id.isEmpty() && !tabelaSimbolos.containsKey(id)) {
            System.err.println("Não foi possivel encontrar o simbolo " + id);
            System.exit(0);
        }
        int qtd = 0;
        if (ctx.elementoCall() != null) {
            qtd = ctx.elementoCall().elemento().size() + ctx.elementoCall().expressao().size();
        }
        List<GramaticaSintatica.VariavelContext> parametrosMetodo = tabelaParametros.get(ctx.ID().getText());
        if (parametrosMetodo.size() != qtd) {
            System.err.println("Quantidade de parametros esperados é diferente da passada");
            System.exit(0);
        }
    }

    @Override
    public void exitFor(GramaticaSintatica.ForContext ctx) {
        List<TerminalNode> id = ctx.ID();
        for (TerminalNode i : id) {
            if (!tabelaSimbolos.containsKey(i.getText())) {
                System.err.println("Não foi possivel encontrar o simbolo " + i.getText());
                System.exit(0);
            } else if (!(tabelaSimbolos.get(i.getText()).equals("INTEIRO") || tabelaSimbolos.get(i.getText()).equals("REAL"))) {
                System.err.println("Tipo invalido para operação: " + tabelaSimbolos.get(i.getText()));
                System.exit(0);
            }
        }
    }

    @Override
    public void exitExprAt(GramaticaSintatica.ExprAtContext ctx) {
        String id = ctx.ID().getText();
        String tipoID = tabelaSimbolos.get(id);
        if (!tabelaSimbolos.containsKey(id)) {
            System.err.println("Não foi possivel encontrar o simbolo " + id);
            System.exit(0);
        }
        if (ctx.exprCondicional() != null && !tabelaSimbolos.get(id).equals("BOOLEANO")) {
            System.err.println("Tipo do Valor passado é diferente do requerido: " + tabelaSimbolos.get(id) + " diferente de " + "BOOLEANO");
            System.exit(0);
        }
        if (ctx.elemento() != null) {
            GramaticaSintatica.ElementoContext elemento = ctx.elemento();
            if (elemento.ID() != null || elemento.callFunc() != null) {
                String tipoVariavel = tabelaSimbolos.get(elemento.ID() != null ? elemento.ID().getText() : elemento.callFunc().ID().getText());
                if (!tipoID.equals(tipoVariavel) && !(tipoID.equals("REAL") && tipoVariavel.equals("INTEIRO"))) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de " + tipoVariavel);
                    System.exit(0);
                }
            } else if (elemento.TEXTO() != null) {
                if (!tipoID.equals("CARACTERE")) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de CARACTERE");
                    System.exit(0);
                }
            } else if (elemento.VALBO() != null) {
                if (!tipoID.equals("BOOLEANO")) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de BOOLEANO");
                    System.exit(0);
                }
            } else if (elemento.NUM() != null) {
                if (!(tipoID.equals("INTEIRO") || tipoID.equals("REAL"))) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de REAL/INTEIRO");
                    System.exit(0);
                }
            }
        }
        if (ctx.exprAr() != null) {
            GramaticaSintatica.ElementoContext elemento = ctx.exprAr().elemento(0);
            if (elemento.ID() != null || elemento.callFunc() != null) {
                String tipoVariavel = tabelaSimbolos.get(elemento.ID() != null ? elemento.ID().getText() : elemento.callFunc().ID().getText());
                if (!tipoID.equals(tipoVariavel) && !(tipoID.equals("REAL") && tipoVariavel.equals("INTEIRO"))) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de " + tipoVariavel);
                    System.exit(0);
                }
            } else if (elemento.TEXTO() != null) {
                if (!tipoID.equals("CARACTERE")) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de CARACTERE");
                    System.exit(0);
                }
            } else if (elemento.VALBO() != null) {
                if (!tipoID.equals("BOOLEANO")) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de BOOLEANO");
                    System.exit(0);
                }
            } else if (elemento.NUM() != null) {
                if (!(tipoID.equals("INTEIRO") || tipoID.equals("REAL"))) {
                    System.err.println("Tipo do Valor passado é diferente do requerido: " + tipoID + " diferente de REAL/INTEIRO");
                    System.exit(0);
                }
            }
        }
    }

    @Override
    public void exitVariavel(GramaticaSintatica.VariavelContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        if (tabelaSimbolos.containsKey(id)) {
            System.err.println("Declaração duplicada! Variável " + id + " já declarada");
            System.exit(0);
        } else {
            tabelaSimbolos.put(id, tipo);
        }
    }

    @Override
    public void exitMetodo(GramaticaSintatica.MetodoContext ctx) {
        tabelaParametros.put(ctx.variavel().ID().getText(), ctx.parametrosFunc().variavel());
        GramaticaSintatica.ElementoContext elemento = ctx.retorno().elemento();
        String tipoMetodo = ctx.variavel().TIPO().getText();
        if (elemento.ID() != null || elemento.callFunc() != null) {
            String tipoVariavel = tabelaSimbolos.get(elemento.ID() != null ? elemento.ID().getText() : elemento.callFunc().ID().getText());
            if (!tipoMetodo.equals(tipoVariavel) && !(tipoMetodo.equals("REAL") && tipoVariavel.equals("INTEIRO"))) {
                System.err.println("Tipo de Retorno passado é diferente do esperado");
                System.exit(0);
            }
        } else if (elemento.TEXTO() != null || elemento.input() != null) {
            if (!tipoMetodo.equals("CARACTERE")) {
                System.err.println("Tipo de Retorno passado é diferente do esperado");
                System.exit(0);
            }
        } else if (elemento.VALBO() != null) {
            if (!tipoMetodo.equals("BOOLEANO")) {
                System.err.println("Tipo de Retorno passado é diferente do esperado");
                System.exit(0);
            }
        } else if (elemento.NUM() != null) {
            if (!(tipoMetodo.equals("INTEIRO") || tipoMetodo.equals("REAL"))) {
                System.err.println("Tipo de Retorno passado é diferente do esperado");
                System.exit(0);
            }
        }
    }

    @Override
    public void exitExprAr(GramaticaSintatica.ExprArContext ctx) {
        if (ctx.elemento(0).VALBO() != null || ctx.elemento(1).VALBO() != null
                || (ctx.elemento(0).ID() != null && getTabelaSimbolos().get(ctx.elemento(0).ID().getText()).equals("BOOLEANO"))
                || (ctx.elemento(1).ID() != null && getTabelaSimbolos().get(ctx.elemento(1).ID().getText()).equals("BOOLEANO"))
                || (ctx.elemento(0).callFunc() != null && getTabelaSimbolos().get(ctx.elemento(0).callFunc().ID().getText()).equals("BOOLEANO"))
                || (ctx.elemento(1).callFunc() != null && getTabelaSimbolos().get(ctx.elemento(1).callFunc().ID().getText()).equals("BOOLEANO"))) {
            System.err.println("Operação não aplicavel para BOOLEANO");
            System.exit(0);
        }
        if (((ctx.elemento(0).ID() != null && getTabelaSimbolos().get(ctx.elemento(0).ID().getText()).equals("CARACTERE"))
                || (ctx.elemento(1).ID() != null && getTabelaSimbolos().get(ctx.elemento(1).ID().getText()).equals("CARACTERE"))
                || (ctx.elemento(0).callFunc() != null && getTabelaSimbolos().get(ctx.elemento(0).callFunc().ID().getText()).equals("CARACTERE"))
                || (ctx.elemento(1).callFunc() != null && getTabelaSimbolos().get(ctx.elemento(1).callFunc().ID().getText()).equals("CARACTERE"))
                || ctx.elemento(0).TEXTO() != null || ctx.elemento(1).TEXTO() != null) && !ctx.OPAR().getText().equals("+")) {
            System.err.println("Operação não aplicavel para CARACTERE/TEXTO");
            System.exit(0);
        }
        GramaticaSintatica.ElementoContext elemento1 = ctx.elemento(0);
        GramaticaSintatica.ElementoContext elemento2 = ctx.elemento(1);
        if (elemento1.ID() != null || elemento1.callFunc() != null) {
            String tipoEl1 = (elemento1.ID() != null ? getTabelaSimbolos().get(elemento1.ID().getText()) : getTabelaSimbolos().get(elemento1.callFunc().ID().getText()));
            if (elemento2.ID() != null || elemento2.callFunc() != null) {
                String tipoEl2 = (elemento2.ID() != null ? getTabelaSimbolos().get(elemento2.ID().getText()) : getTabelaSimbolos().get(elemento2.callFunc().ID().getText()));
                if (!tipoEl1.equals(tipoEl2) &&
                        !((tipoEl1.equals("REAL")
                                && tipoEl2.equals("INTEIRO"))
                                || (tipoEl2.equals("REAL")
                                || tipoEl1.equals("INTEIRO")))) {
                    System.err.println("Operacao invalida para os tipos " + tipoEl1 + " e " + tipoEl2);
                    System.exit(0);
                }
            }
        } else if (elemento1.NUM() != null) {
            if (elemento2.ID() != null || elemento2.callFunc() != null) {
                String tipoEl2 = (elemento2.ID() != null ? getTabelaSimbolos().get(elemento2.ID().getText()) : getTabelaSimbolos().get(elemento2.callFunc().ID().getText()));
                if (!(tipoEl2.equals("INTEIRO") || tipoEl2.equals("REAL"))) {
                    System.err.println("Operacao invalida para os tipos NUMERO e " + tipoEl2);
                    System.exit(0);
                }
            } else if (elemento2.TEXTO() != null) {
                System.err.println("Operacao invalida para os tipos NUMERO e CARACTERE");
                System.exit(0);
            }
        }
    }

    @Override
    public void exitExprRelacional(GramaticaSintatica.ExprRelacionalContext ctx) {
        GramaticaSintatica.ElementoContext elemento1 = ctx.elemento(0);
        GramaticaSintatica.ElementoContext elemento2 = ctx.elemento(1);
        if ((elemento1.VALBO() != null || elemento2.VALBO() != null) && !(ctx.OPRE().getText().equals("==") || ctx.OPRE().getText().equals("!="))) {
            System.err.println("Operacao invalida para o tipo BOOLEANO");
            System.exit(0);
        }
        if (elemento1.ID() != null || elemento1.callFunc() != null) {
            String tipoEl1 = (elemento1.ID() != null ? getTabelaSimbolos().get(elemento1.ID().getText()) : getTabelaSimbolos().get(elemento1.callFunc().ID().getText()));
            if (elemento2.ID() != null || elemento2.callFunc() != null) {
                String tipoEl2 = (elemento2.ID() != null ? getTabelaSimbolos().get(elemento2.ID().getText()) : getTabelaSimbolos().get(elemento2.callFunc().ID().getText()));
                if (!tipoEl1.equals(tipoEl2) &&
                        !((tipoEl1.equals("REAL") && tipoEl2.equals("INTEIRO")) || (tipoEl2.equals("REAL") && tipoEl1.equals("INTEIRO")))) {
                    System.err.println("Operacao invalida para os tipos " + tipoEl1 + " e " + tipoEl2);
                    System.exit(0);
                }
            } else if (elemento2.TEXTO() != null) {
                if (!tipoEl1.equals("CARACTERE")) {
                    System.err.println("Operacao invalida para os tipos " + tipoEl1 + " e CARACTERE");
                    System.exit(0);
                }
            } else if (elemento2.NUM() != null) {
                if (!tipoEl1.equals("INTEIRO") && !tipoEl1.equals("REAL")) {
                    System.err.println("Operacao invalida para os tipos " + tipoEl1 + " e NUMERAL");
                    System.exit(0);
                }
            } else if (elemento2.VALBO() != null) {
                if (!tipoEl1.equals("BOOLEANO")) {
                    System.err.println("Operacao invalida para os tipos " + tipoEl1 + " e BOOLEANO");
                    System.exit(0);
                }
            }
            if (tipoEl1.equals("BOOLEANO") && !(ctx.OPRE().getText().equals("==") || ctx.OPRE().getText().equals("!="))) {
                System.err.println("Operacao invalida para o tipo BOOLEANO");
                System.exit(0);
            }
        } else if (elemento1.NUM() != null) {
            if (elemento2.ID() != null || elemento2.callFunc() != null) {
                String tipoEl2 = (elemento2.ID() != null ? getTabelaSimbolos().get(elemento2.ID().getText()) : getTabelaSimbolos().get(elemento2.callFunc().ID().getText()));
                if (!(tipoEl2.equals("REAL") || tipoEl2.equals("INTEIRO"))) {
                    System.err.println("Operacao invalida para os tipos NUMERO" + " e " + tipoEl2);
                    System.exit(0);
                }
            } else if (elemento2.TEXTO() != null) {
                System.err.println("Operacao invalida para os tipos NUMERO e CARACTERE");
                System.exit(0);
            } else if (elemento2.VALBO() != null) {
                System.err.println("Operacao invalida para os tipos NUMERO e BOOLEANO");
                System.exit(0);
            }
        } else if (elemento1.TEXTO() != null) {
            if (elemento2.ID() != null || elemento2.callFunc() != null) {
                String tipoEl2 = (elemento2.ID() != null ? getTabelaSimbolos().get(elemento2.ID().getText()) : getTabelaSimbolos().get(elemento2.callFunc().ID().getText()));
                if (!tipoEl2.equals("CARACTERE")) {
                    System.err.println("Operacao invalida para os tipos CARACTERE" + " e " + tipoEl2);
                    System.exit(0);
                }
            } else if (elemento2.NUM() != null) {
                System.err.println("Operacao invalida para os tipos CARACTERE e NUMERO");
                System.exit(0);
            } else if (elemento2.VALBO() != null) {
                System.err.println("Operacao invalida para os tipos CARACTERE e BOOLEANO");
                System.exit(0);
            }
        } else if (elemento1.VALBO() != null) {
            if (elemento2.ID() != null || elemento2.callFunc() != null) {
                String tipoEl2 = (elemento2.ID() != null ? getTabelaSimbolos().get(elemento2.ID().getText()) : getTabelaSimbolos().get(elemento2.callFunc().ID().getText()));
                if (!tipoEl2.equals("BOOLEANO")) {
                    System.err.println("Operacao invalida para os tipos BOOLEANO" + " e " + tipoEl2);
                    System.exit(0);
                }
            } else if (elemento2.VALBO() == null) {
                System.err.println("Operacao invalida para os tipos BOOLEANO");
                System.exit(0);
            }
        }
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
