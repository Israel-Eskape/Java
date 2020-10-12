import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;



public class FocalUbuntu{
    public static void init(){
        StdDraw.setPenColor(new Color(68,19,50));
        StdDraw.filledSquare(1, 1, 1.0);
        draw();

    }
    public static void draw(){
        StdDraw.setPenColor(new Color(206,76,49));
        StdDraw.setPenRadius(0.005);

        ArrayList<Point2D> pts = new ArrayList<>();
        //Left
        //Ear Left
        pts.add(new Point2D.Double(32.2,97.9));
        pts.add(new Point2D.Double(32.2,88.04));
        pts.add(new Point2D.Double(34.18,83.5));
        pts.add(new Point2D.Double(40.2,86.18));
        poligono(pts,0);
        pts.add(new Point2D.Double(32.2,97.9));
        pts.add(new Point2D.Double(28.45,94.43));
        pts.add(new Point2D.Double(27.98,83.09));
        pts.add(new Point2D.Double(29.88,78.76));
        pts.add(new Point2D.Double(34.18,83.09));
        pts.add(new Point2D.Double(32.27,87.01));
        poligono(pts, 1);
        //Abajo de la oreja
        pts.add(new Point2D.Double(40.2,86.18));
        pts.add(new Point2D.Double(34.18,83.5));
        pts.add(new Point2D.Double(29.88,78.76));
        pts.add(new Point2D.Double(28.13,71.95));
        pts.add(new Point2D.Double(31.63,67.42));
        pts.add(new Point2D.Double(33.06,77.1));
        poligono(pts,0);
        //lado izquierdo del ojo
        StdDraw.setPenColor(new Color(206,76,49));
        pts.add(new Point2D.Double(28.13,71.95));
        pts.add(new Point2D.Double(25.43,61.85));
        pts.add(new Point2D.Double(26.23,55.46));
        pts.add(new Point2D.Double(27.02,56.08));
        pts.add(new Point2D.Double(31.47,67.01));
        poligono(pts, 0);
        //Centro
        pts.add(new Point2D.Double(40.2,86.18));
        pts.add(new Point2D.Double(33.06,77.1));
        pts.add(new Point2D.Double(31.63,67.42));
        pts.add(new Point2D.Double(27.18,56.08));
        pts.add(new Point2D.Double(29.72,57.93));
        pts.add(new Point2D.Double(34.65,58.5));
        pts.add(new Point2D.Double(38.47,54.49));
        pts.add(new Point2D.Double(40.54,67.21));
        pts.add(new Point2D.Double(47.69,76.9));
        pts.add(new Point2D.Double(60.09,86.80));
        pts.add(new Point2D.Double(49.92,88.65));
        poligono(pts, 0);
        //Arriba del ojo
        pts.add(new Point2D.Double(60.09,86.80));
        pts.add(new Point2D.Double(47.69,76.9));
        pts.add(new Point2D.Double(50.23,68.65));
        pts.add(new Point2D.Double(58.34,67.62));
        pts.add(new Point2D.Double(63.11,74.02));
        pts.add(new Point2D.Double(64.22,84.5));
        poligono(pts, 0);
        //A lado del ojo
        pts.add(new Point2D.Double(47.69,76.9));
        pts.add(new Point2D.Double(40.54,67.21));
        pts.add(new Point2D.Double(38.47,54.49));
        pts.add(new Point2D.Double(38.79,51.95));
        pts.add(new Point2D.Double(46.10,53.60));
        pts.add(new Point2D.Double(46.74,58.35));
        pts.add(new Point2D.Double(46.89,64.74));
        pts.add(new Point2D.Double(50.23,68.65));
        poligono(pts, 0);
        //Ojo Izquierdo
        StdDraw.setPenColor(StdDraw.WHITE);
        pts.add(new Point2D.Double(29.25,70.30));
        pts.add(new Point2D.Double(27.98,64.94));
        pts.add(new Point2D.Double(28.77,61.44));
        pts.add(new Point2D.Double(31.31,67.8));
        poligono(pts, 1);
        //Ojo Derecho
        pts.add(new Point2D.Double(50.30,68.65));
        pts.add(new Point2D.Double(47.21,64.75));
        pts.add(new Point2D.Double(46.89,58.76));
        pts.add(new Point2D.Double(48.48,60.82));
        pts.add(new Point2D.Double(52.14,60.61));
        pts.add(new Point2D.Double(58.18,67.83));
        poligono(pts, 1);

        //Ear Rigth
        StdDraw.setPenColor(new Color(206,76,49));

        pts.add(new Point2D.Double(83.6,94.4));
        pts.add(new Point2D.Double(76.4,96.7));
        pts.add(new Point2D.Double(69.15,90.51));
        pts.add(new Point2D.Double(67.7,84.1));
        pts.add(new Point2D.Double(69.7,70.72));
        pts.add(new Point2D.Double(80.12,75.05));
        pts.add(new Point2D.Double(80.28,81.64));
        poligono(pts,1);
        //Oreja vacio
        pts.add(new Point2D.Double(69.15,90.51));
        pts.add(new Point2D.Double(64.22,84.5));
        pts.add(new Point2D.Double(63.11,74.02));
        pts.add(new Point2D.Double(67.7,84.1));
        poligono(pts, 0);
        //derecha del ojo derecho 
        pts.add(new Point2D.Double(67.7,84.1));
        pts.add(new Point2D.Double(63.11,74.02));
        pts.add(new Point2D.Double(58.18,67.83));
        pts.add(new Point2D.Double(52.14,60.61));
        pts.add(new Point2D.Double(48.48,60.82));
        pts.add(new Point2D.Double(46.89,58.76));
        pts.add(new Point2D.Double(46.10,53.60));
        pts.add(new Point2D.Double(49.12,49.69));
        pts.add(new Point2D.Double(68.36,53.60));
        pts.add(new Point2D.Double(69.7,70.72));
        poligono(pts, 0);
        //Abajo de la oreja rellena
        pts.add(new Point2D.Double(69.7,70.72));
        pts.add(new Point2D.Double(68.36,53.60));
        pts.add(new Point2D.Double(72.97,54.63));
        pts.add(new Point2D.Double(74.56,58.76));
        pts.add(new Point2D.Double(80.00,75.05));
        poligono(pts, 0);
        
        


    }
    public static void poligono(ArrayList<Point2D> p,int t){
        double [] x = new double [p.size()];
        double [] y = new double [p.size()];
        for(int i =0;i<p.size();i++){
            x[i]= p.get(i).getX()/100;
            y[i]= p.get(i).getY()/100;
        }
        if(t == 0)
            StdDraw.polygon(x,y);
        if(t == 1)
            StdDraw.filledPolygon(x,y);
        p.clear();
    }

    public static void main(String [] args){
        init();
    }
}