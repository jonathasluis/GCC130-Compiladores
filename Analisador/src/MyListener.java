import antlr.GramaticaSintatica;
import antlr.GramaticaSintaticaBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends GramaticaSintaticaBaseListener {

    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();

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
    }

    @Override
    public void exitFor(GramaticaSintatica.ForContext ctx) {
        List<TerminalNode> id = ctx.ID();
        for (TerminalNode i : id) {
            if (!tabelaSimbolos.containsKey(i.getText())) {
                System.err.println("Não foi possivel encontrar o simbolo " + i.getText());
                System.exit(0);
            }else if (!(tabelaSimbolos.get(i.getText()).equals("INTEIRO") || tabelaSimbolos.get(i.getText()).equals("REAL"))){
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
        if (ctx.elemento(0).VALBO() != null || ctx.elemento(1).VALBO() != null) {
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
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
