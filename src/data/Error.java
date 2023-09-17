
package data;

/**
 *
 * @author kevin
 */
public class Error {
    public String tipo;
    public String descripcion;
    public int linea, columna;
    
    public Error(String tipo, String descripcion, int linea, int columna) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.linea = linea;
        this.columna = columna;
    }

    @Override
    public  String toString() {
        String contenido = "<tr>\n" +
"            <td>"+ this.descripcion +"</td>\n" +
"            <td>"+ this.tipo +"</td>\n" +
"            <td>"+ this.linea +"</td>\n" +
"            <td>"+ this.columna +"</td>\n" +
"            </tr>\n";
        
        return contenido;
    }
}
