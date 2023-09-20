
package data;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author kevin
 */
public class Graficar {
     
     public static void Barras(
            String Titulo,
            String TituloX,
            String TituloY,
            double valores[],
            String ejex[]) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < valores.length; i++) {
            dataset.addValue(valores[i], "Valor", ejex[i]);
        }

        JFreeChart grafica = ChartFactory.createBarChart(
                Titulo,
                TituloX, TituloY,
                dataset,
                PlotOrientation.VERTICAL,
                true, true, true);

        // Mostrar
        ChartFrame frame = new ChartFrame("bars", grafica);
        
        frame.pack();
        frame.setVisible(true);
    }

    public static void Linea(
            String Titulo,
            String TituloX,
            String TituloY,
            double valores[],
            String ejex[]) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < valores.length; i++) {
            dataset.addValue(valores[i], "Valor", ejex[i]);
        }

        JFreeChart grafica = ChartFactory.createLineChart(
                Titulo,
                TituloX,
                TituloY,
                dataset);

        ChartFrame frame = new ChartFrame("lines", grafica);
        frame.pack();
        frame.setVisible(true);
    }

    public static void Pie(
            String Titulo,
            String TituloX,
            String TituloY,
            double valores[],
            String ejex[]) {
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (int i = 0; i < valores.length; i++) {
            dataset.setValue(ejex[i], valores[i]);
        }
        JFreeChart grafica = ChartFactory.createPieChart(Titulo, dataset);

        ChartFrame frame = new ChartFrame("pies", grafica);
        frame.pack();
        frame.setVisible(true);
    }
}
