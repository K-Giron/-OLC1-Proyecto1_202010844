
package principal;

import java.io.StringReader;


public class Main {


    public static void main(String[] args) {
        //analizadores("src/statpy/", "Lexer.jflex","Parser.cup");
        
        String entrada="""
                       void main(){
                       switch(valor){
                       case 1:
                            precio = 55;
                       Console.Write("el valor de a es: " + a);
                       case 2:
                            precio = 25;
                       Console.Write("el valor de a es: " + a);
                       case 3:
                            precio = 40;
                       default:
                            Console.Write("No válido. Escoja 1, 2, o 3.");
                       }
                       for (int a=0; a<10; a++){
                       Console.Write("el valor de a es: " + a);
                       }
                       int enteros = simpleEntero + 2 - 2 * 2 / 2;
                       double decimales = 2.0 - 3.4;
                       while(a < 10){
                       Console.Write("el valor de a es: " + 500);
                       }
                       }
                       """;
        analizar(entrada);
        System.out.println(statpy.Parser.resultado);
        
        System.out.println("ERRORES ######################");
        data.Info.listaErrores.forEach((t)->{
            System.out.println(t.toString());
        });
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
    
}
