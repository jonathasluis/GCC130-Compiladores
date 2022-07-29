import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExemploLexer {

    public static void main(String[] args) {
        List<Integer> linhas = new ArrayList<Integer>();
        String filename = "AnalisadorLexico/src/codigo.txt";
        //String filename = "AnalisadorLexico/src/codigoErro.txt";
        System.out.println("Token: <\"Lexema\",\"Classe\">\n");
        try {
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nErros nas linhas: " + linhas);
    }
}
