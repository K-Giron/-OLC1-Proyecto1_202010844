
package principal;

import java.io.StringReader;


public class Main {


    public static void main(String[] args) {
        //analizadores("src/statpy/", "Lexer.jflex","Parser.cup");
        //analizadores("src/jsonn/", "Lexer.jflex","Parser.cup");
                
        String entrada="""
                       /*
                       
                       Carga de tercer objeto json archivo dificil
                       
                       */
                       
                       {
                       	"titulo2":"Reporte 2 DIFICIL",
                           "v1":"prob1",
                           "v2":"prob2",
                           "v3":"prob3",
                           "p1":20.8,
                           "p2":30.4
                       dsfdsfdsf

                       }
                       """;
        analizarJson(entrada);
        System.out.println(statpy.Parser.resultado);
        System.out.println(jsonn.Parser.resultado);
        data.Info.reporteJson();
        for(String i: data.Info.listaVariables.keySet()){
            System.out.println("key: "+i+" - value: "+data.Info.listaVariables.get(i));
        }
        
        System.out.println("ERRORES ######################");
        data.Info.listaErroresStatpy.forEach((t)->{
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
