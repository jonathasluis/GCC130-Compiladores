import antlr.GramaticaLexica;
import antlr.GramaticaSintatica;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExemploLexer {

    public static void main(String[] args) {
        String filename = "Analisador/src/testes/TESTE.txt";
        //lexico(filename);
        ParseTree ast = sintatico(filename);
        MyListener listener = new MyListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, ast);
    }

    public static ParseTree sintatico(String filename) {
        GramaticaSintatica parser = null;
        ParseTree ast = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            GramaticaLexica lexer = new GramaticaLexica(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GramaticaSintatica(tokens);
            ast = parser.inicio();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Nao ha erros sintaticos\n");
            } else {
                System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ast;
    }

    public static void lexico(String filename) {
        List<Integer> linhas = new ArrayList<Integer>();
        try {
            CharStream input = CharStreams.fromFileName(filename);
            GramaticaLexica lexer = new GramaticaLexica(input);
            Token token;
            while (!lexer._hitEOF) {
                token = lexer.nextToken();
                if (!lexer.getVocabulary().getDisplayName(token.getType())
                          .equalsIgnoreCase("ErrorChar")) {
                    System.out.print(" <\""
                            + lexer.getVocabulary().getDisplayName(token.getType()) + "\",\""
                            + token.getText() + "\"> ");
                } else {
                    if (!linhas.contains(token.getLine())) {
                        linhas.add(token.getLine());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (linhas.size() > 0) {
            System.out.println("\nErros lexicos nas linhas: " + linhas + "\n");
        } else {
            System.out.println("\nNao ha erros lexicos\n");
        }
    }
}
