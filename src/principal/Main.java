
package principal;

import java.io.StringReader;


public class Main {


    public static void main(String[] args) {
        //analizadores("src/statpy/", "Lexer.jflex","Parser.cup");
        
        String entrada="""
                       void main(){                   
                       /* operaciones 
                           aritmeticas logicas y relacionales  
                           */
                       int simpleEntero = 10;
                           int enteros = simpleEntero + 2 - 2 * 2 / 2;
                           double decimales = 2.0 - 3.4;
                           decimales = 65.7 * decimales; // Asignacion
                           String concatenacion = "Hola mundo" + "Esto es una concatenacion";
                           String concatenacion_2 = "Concatenar con variables" + concatenacion;
                           char x = 'a';
                           bool flag = 5 > 9 || 7 > 10 && 20 > 12;
                       
                           console.write(5 > 9 || 7 > 10 && 20 > 12 + x + concatenacion + "Esto es un write"+ 48 * 7 - 5 * 20 + True || False+ x == 10);
                       
                           for (int x = 0; x >= 10; x++) {
                                   int j = 10;
                                   if (x == 5 || x == 10) {
                                       console.write("Esto es un if dentro de un for");
                                       while (7 != 10 && x != 20) {
                                           j = j + 1;
                                           console.write("esto es un while dentro de un if");
                                           if (j == 10) {
                           
                                               for (int f = 5; f > 10 ; f++){
                                                   console.write("XD");
                                               }
                                               break;
                                           }
                                       }
                                   }
                               }
                       
                               int contador = 0;
                                   do{
                               
                                       if ( contador == 5){
                                           console.write("mitad");
                                       }else if (contador == 6){
                                           console.write("Mas de la mitad");
                                       } else if ( contador == 7){
                                           console.write ("Dos más que la mitad");
                               
                                           if (contador + 1 == 8){
                                               console.write("Ya casi llegamos");
                                           }else{
                                               console.write("Todavía falta");
                                           }
                                       }else{
                                           console.write("Esto es un else ");
                                       }
                               
                               
                                   } while ( contador != 10 );
                               
                                   // switch con instrucciones anidadas
                               
                                   int precio = 0;
                               
                                   switch(valor){
                                           case 1:
                                               precio = 55;
                                               if(10 > 5){
                                                   Console.Write("a) " + precio);
                                                } else if (10 < 5){
                                                   Console.Write("b) " + precio);
                                                }
                                               break;
                                           case 2:
                                               precio = 25;
                                           case 3:
                                               precio = 40;
                                           default:
                                               Console.Write("No válido. Escoja 1, 2, o 3.");
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
