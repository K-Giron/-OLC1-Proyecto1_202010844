
package data;

import java.util.HashMap;
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 *
 * @author kevin
 */
public class Info {
    public static LinkedList<Error> listaErroresStatpy = new LinkedList<>();
    public static LinkedList<Error> listaErroresJson = new LinkedList<>();
    public static HashMap<String, String > listaVariables= new HashMap<>();
    public static int ultimoCase=0;
    
    public static void reporteJson() {
        String nombreArchivo = "Reporte_Json.html";

        // Contenido del HTML que quieres escribir
        String contenido = "<html>\n" +
                "<head>\n" +
                "<title>Reporte de errores</title>\n" +
                "<style>\n" + // Agregar estilos CSS
                "    body {\n" +
                "        text-align: center;\n" + // Centra el contenido
                "        font-family: Arial, sans-serif;\n" + // Cambia la fuente
                "    }\n" +
                "    h1 {\n" +
                "        color: #333;\n" + // Cambia el color del título
                "    }\n" +
                "    table {\n" +
                "        width: 80%;\n" + // Establece el ancho de la tabla
                "        margin: 0 auto;\n" + // Centra la tabla horizontalmente
                "        border-collapse: collapse;\n" + // Combina los bordes de la tabla
                "    }\n" +
                "    th, td {\n" +
                "        border: 1px solid #333;\n" + // Establece bordes para celdas
                "        padding: 8px;\n" + // Agrega espacio alrededor del contenido de celda
                "        text-align: left;\n" + // Alinea el texto a la izquierda en celdas
                "    }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Errores Lexicos y Sintacticos</h1>\n";

        contenido += "<table>" +
                "        <tr>\n" +
                "            <th>Descripción</th>\n" +
                "            <th>Tipo</th>\n" +
                "            <th>Linea</th>\n" +
                "            <th>Columna</th>\n" +
                "        </tr>\n";
        for (Error elemento : listaErroresJson) {
            contenido += elemento;
        }

        contenido += "</table>\n" +
                "</body>\n" +
                "</html>";

        try {
            // Crea un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter("src/Reportes/" + nombreArchivo);

            // Crea un objeto BufferedWriter para escribir el contenido de manera eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribe el contenido del HTML en el archivo
            bufferedWriter.write(contenido);

            // Cierra el BufferedWriter y FileWriter
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Se ha creado el archivo HTML exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Errore al crear un archivo");
            e.printStackTrace();
        }
    }
    
    public static void reporteStatpy(){        
        String nombreArchivo = "Reporte_Statpy.html";
        
        // Contenido del HTML que quieres escribir
        // Contenido del HTML que quieres escribir
        String contenido = "<html>\n" +
                "<head>\n" +
                "<title>Reporte de errores</title>\n" +
                "<style>\n" + // Agregar estilos CSS
                "    body {\n" +
                "        text-align: center;\n" + // Centra el contenido
                "        font-family: Arial, sans-serif;\n" + // Cambia la fuente
                "    }\n" +
                "    h1 {\n" +
                "        color: #333;\n" + // Cambia el color del título
                "    }\n" +
                "    table {\n" +
                "        width: 80%;\n" + // Establece el ancho de la tabla
                "        margin: 0 auto;\n" + // Centra la tabla horizontalmente
                "        border-collapse: collapse;\n" + // Combina los bordes de la tabla
                "    }\n" +
                "    th, td {\n" +
                "        border: 1px solid #333;\n" + // Establece bordes para celdas
                "        padding: 8px;\n" + // Agrega espacio alrededor del contenido de celda
                "        text-align: left;\n" + // Alinea el texto a la izquierda en celdas
                "    }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Errores Lexicos y Sintacticos</h1>\n";

        contenido += "<table>" +
                "        <tr>\n" +
                "            <th>Descripción</th>\n" +
                "            <th>Tipo</th>\n" +
                "            <th>Linea</th>\n" +
                "            <th>Columna</th>\n" +
                "        </tr>\n";
        for (Error elemento : listaErroresStatpy) {
            contenido += elemento;
        }

        contenido += "</table>\n" +
                "</body>\n" +
                "</html>";

        try {
            // Crea un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter("src/Reportes/" + nombreArchivo);

            // Crea un objeto BufferedWriter para escribir el contenido de manera eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribe el contenido del HTML en el archivo
            bufferedWriter.write(contenido);

            // Cierra el BufferedWriter y FileWriter
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Se ha creado el archivo HTML exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Errore al crear un archivo");
            e.printStackTrace();
        }
    }

}
