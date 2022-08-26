import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExemploLexer {

    public static void main(String[] args) {
        List<Integer> linhas = new ArrayList<Integer>();
        String filename = "AnalisadorLexico/src/TESTE.txt";
        //String filename = "AnalisadorLexico/src/codigoErro.txt";
        System.out.println("Token: <\"Lexema\",\"Classe\">\n");
        try {
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramatica lexer = new MinhaGramatica(input);
            Token token;
            while (!lexer._hitEOF) {
                token = lexer.nextToken();
                if (!lexer.getVocabulary().getDisplayName(token.getType()).equalsIgnoreCase("ErrorChar")) {
                    System.out.println("Token: <\""
                            + token.getText()
                            + "\",\""
                            + lexer.getVocabulary().getDisplayName(token.getType())
                            + "\">");
                } else {
                    if (!linhas.contains(token.getLine())) {
                        linhas.add(token.getLine());
                    }
                }
            }
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaSintatica teste = new GramaticaSintatica(tokens);
            teste.programa();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nErros nas linhas: " + linhas);
    }

}
