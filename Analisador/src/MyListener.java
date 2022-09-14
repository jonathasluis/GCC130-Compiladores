import antlr.GramaticaSintatica;
import antlr.GramaticaSintaticaBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends GramaticaSintaticaBaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();

    @Override
    public void exitElemento(GramaticaSintatica.ElementoContext ctx){
        String id = (ctx.ID() != null ? ctx.ID().getText() : "");
        if (!id.isEmpty() && !tabelaSimbolos.containsKey(id)){
            System.out.println("Não foi possivel encontrar o simbolo " + id);
        }
    }

    @Override
    public void exitCallFunc(GramaticaSintatica.CallFuncContext ctx){
        String id = (ctx.ID() != null ? ctx.ID().getText() : "");
        if (!id.isEmpty() && !tabelaSimbolos.containsKey(id)){
            System.out.println("Não foi possivel encontrar o simbolo " + id);
        }
    }

    @Override
    public void exitFor(GramaticaSintatica.ForContext ctx) {
        List<TerminalNode> id = ctx.ID();
        for (TerminalNode i : id) {
            if (!tabelaSimbolos.containsKey(i.getText())) {
                System.out.println("Não foi possivel encontrar o simbolo " + i.getText());
            }
        }
    }

    @Override
    public void exitExprAt(GramaticaSintatica.ExprAtContext ctx){
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("Não foi possivel encontrar o simbolo " + id);
        }
    }

    @Override
    public void exitVariavel(GramaticaSintatica.VariavelContext ctx){
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
