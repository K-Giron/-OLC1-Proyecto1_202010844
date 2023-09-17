
package principal;

import java.io.StringReader;


public class Main {


    public static void main(String[] args) {
        analizadores("src/statpy/", "Lexer.jflex","Parser.cup");
        analizadores("src/jsonn/", "Lexer.jflex","Parser.cup");
        
       Ventana ventana = new Ventana();
        ventana.setVisible(true);        

    }
   
    
    public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }

    public static void analizar (String entrada){
        try {
            statpy.Lexer lexer = new statpy.Lexer(new StringReader(entrada)); 
            statpy.Parser parser = new statpy.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    }
    public static void analizarJson(String entrada){
        try {
            jsonn.Lexer lexer = new jsonn.Lexer(new StringReader(entrada)); 
            jsonn.Parser parser = new jsonn.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    }
    
}
