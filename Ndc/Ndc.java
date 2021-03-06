/**
 * Ndc.java
 * Graficación 
 * G. Israel Avendaño Martínez
 */

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.awt.*;


public class Ndc extends JFrame {
 
    JLabel jlabelR = new JLabel();
    
    JPanel panelaux = new JPanel();
    JPanel panel0 = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();

    JScrollPane jScrollPane;
    Ndc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 700);
        setResizable(false);

        jScrollPane = new JScrollPane();
        jScrollPane.setBounds(0, 10, 500, 500);
        
        panelaux.setLayout(null);
        panelaux.setPreferredSize(new Dimension(1280,700));
        jScrollPane.setViewportView(panelaux);
        add(jScrollPane);

        setVisible(true);
        initPaneles();
        dibujar();

    }

    public void initPaneles() {

        /**
         * Se inicializan los paneles con una posición y un tamaño especifico
         * para cada panel. en este trabajo tiene 6 paneles 
         */

        panel0.setLocation(10, 10);
        panel0.setSize(800, 600);

        panel1.setLocation(815, 10);
        panel1.setSize(300, 150);
       
        panel2.setLocation(1120, 10);
        panel2.setSize(150, 300);
       
        panel3.setLocation(860, 360);
        panel3.setSize(400, 200);
       
        panel4.setLocation(815, 170);
        panel4.setSize(300, 70);
       
        panel5.setLocation(815, 250);
        panel5.setSize(100, 100);
       
        panel6.setLocation(860, 570);
        panel6.setSize(400, 75);

        
    }

    public void dibujar() {
        try {
            
            // para el panel 800*600
            readFile("ejercicio.txt", panel0);

            // para la interfaz de 300*150
            readFile("ejercicio.txt", panel1);

            // para la interfaz 150*300
            readFile("ejercicio.txt", panel2);

            // para la interfaz de 400*200
            readFile("ejercicio.txt", panel3);

            // para la interfaz de 50*70
            readFile("ejercicio.txt", panel4);

            // para la interfaz de 100*100
            readFile("ejercicio.txt", panel5);

            // para la interfaz de 400*100
            readFile("ejercicio.txt", panel6);

            Thread.sleep(10);
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Warning in ---> Ndc/dibujar  <---" + e.getMessage());
        }

    }

    public void readFile(String nameFile, JPanel panel) {
        ArrayList<Punto> listPoint = new ArrayList();
        try {
            /**
             * Se pasa como referencia un panel donde va a dbujar los puntos que obtenga del archivo que tambien 
             * está recibien.
             * Se calcula el tamaño maximo en x y y del panel y la relación de aspecto que existe
             * Se muestra en pantalla estos calculos y se le asigna un color para visualizar el 
             * tamaño del panel.
             */

            panelaux.add(panel);
            double r = (double) (panel.getSize().getWidth()/panel.getSize().getHeight());
            jlabelR.setText((int)(panel.getSize().getWidth()) + " * "+ (int)(panel.getSize().getHeight())+"  R = "+ r);
            panel.add(jlabelR);
            panel.setBackground(Color.LIGHT_GRAY);
            
            /**
             * Se leé los valores de la figura desde un archivo de texto si encuentra una
             * coma(,) lo separa del primer elemento
             */
            FileReader file = new FileReader(nameFile);
            BufferedReader br = new BufferedReader(file);
            String d;
            while ((d = br.readLine()) != null) {
                
                /** Si en la linea que está leyendo encuentra la palabra end entonces va llamar a la función
                 * para que se grafiquén los puntos y si no lo encuentra se seguirán guardando en un arreglo
                 * el cual se repetirá hasta que encuentre el final de linea o end
                 */
                if (d.equals("end")) {
                    drawImg(panel, listPoint);
                    listPoint.clear();
                } else {
                    StringTokenizer dato = new StringTokenizer(d, ",");
                    Double xx = Double.parseDouble(dato.nextToken().trim());
                    Double yy = Double.parseDouble(dato.nextToken().trim());
                    Punto p = new Punto(xx,yy);
                    listPoint.add(p);
                }
            }
            /**
             * Manda el arreglo de los datos que se leyó del archivo y lo manda a la clase
             * Transformaciones para que los convierta a tipos de dato de clase Punto para
             * poder enviarlo a PanerlPaint para que dibuje dichos puntos
             */
        } catch (Exception exc) {
            JOptionPane.showInternalMessageDialog(null, nameFile + " -->" + exc.getMessage());
        }

    }

    public void drawImg(JPanel panel, ArrayList<Punto> puntos) {
        int dx0 = 0, dy0 = 0;
        int dx1 = 0, dy1 = 0;
        try {
            int xmax = (int) panel.getSize().getWidth();
            int ymax = (int) panel.getSize().getHeight();
            for (int i = 0; i < puntos.size()-1; i++) {

                dx0 = (int) (puntos.get(i).getX() * xmax);
                dy0 = (int) (ymax - (puntos.get(i).getY() * ymax));
                dx1 = (int) (puntos.get(i + 1).getX() * xmax);
                dy1 = (int) (ymax - (puntos.get(i + 1).getY() * ymax));

                Thread.sleep(512);
                panel.getGraphics().drawLine(dx0, dy0, dx1, dy1);
        }
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Warning in ---> Ndc/drawImg  <---" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Ndc();
    }
}
/**
 * Israel Eskape
 * https://github.com/Israel-Eskape/Java/tree/main/Ndc
 * 
 */