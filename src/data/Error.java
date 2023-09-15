
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
    public String toString() {
        return this.tipo + ", descripcion = " + this.descripcion + ", linea= " + this.linea + ", columna= " + this.columna+"\n"  ;
    }
}
