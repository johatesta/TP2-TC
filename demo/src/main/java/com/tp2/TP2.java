//Generated from c:\Users\USUARIO\Documents\TP2\demo\src\main\java\com\tp2\TP2.g4 by ANTLR 4.8
package com.tp2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 *
 */

public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{            
            
            CharStream input = CharStreams.fromFileName("/Users/USUARIO/Documents/TP2/demo/src/main/java/com/tp2/ejemplo.txt");

    
            // create a lexer that feeds off of input CharStream
            TP2Lexer lexer = new TP2Lexer(input);
    
            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
    
            // create a parser that feeds off the tokens buffer
            TP2Parser parser = new TP2Parser(tokens);
            
            // Creo el objeto que tiene los Listeners
    //        reglasANTLRBaseListener escucha = new reglasANTLRBaseListener();
            TP2BaseListener escucha = new TP2CustomListener();
            
            // Conecto el objeto con Listeners al parser
            parser.addParseListener(escucha);
            
            // Solicito al parser que comience indicando una regla gramatical
            // En este caso la regla es el simbolo inicial
            ParseTree tree = parser.prog();
            
    //        // Imprime estadisticas
    //        System.out.println(escucha);
            // Imprime el arbol obtenido
            System.out.println("ARBOL SINTÁCTICO: " + tree.toStringTree(parser));         
            }
            catch(Exception e)
            {
                System.out.println("Error");
    
                //cualquier error, capturamos la exception.   
                e.printStackTrace();
            }
        }
        
    
}