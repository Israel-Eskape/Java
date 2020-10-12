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
        
        //Pupila izq
        StdDraw.setPenColor(new Color(141,53,78));
        StdDraw.filledEllipse(0.2988,0.6536,0.007,0.02);
        //Pupila derecha
        StdDraw.filledEllipse(0.5039,0.6412,0.007,0.02);


        //Ear Rigth
        StdDraw.setPenColor(new Color(206,76,49));
        //oreja Rellena
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
        
        
        //Nariz
        pts.add(new Point2D.Double(27.02,56.08));
        pts.add(new Point2D.Double(26.23,55.46));
        pts.add(new Point2D.Double(29.25,51.75));
        pts.add(new Point2D.Double(36.72,56.28));
        pts.add(new Point2D.Double(34.65,58.5));
        pts.add(new Point2D.Double(29.72,57.93));
        poligono(pts,0);

        pts.add(new Point2D.Double(26.23,55.46));
        pts.add(new Point2D.Double(23.84,51.75));
        pts.add(new Point2D.Double(23.84,48.86));
        pts.add(new Point2D.Double(24.16,44.12));
        pts.add(new Point2D.Double(26.23,40.61));
        pts.add(new Point2D.Double(29.88,39.38));
        pts.add(new Point2D.Double(29.25,51.75));
        poligono(pts, 0);

        pts.add(new Point2D.Double(29.25,51.75));
        pts.add(new Point2D.Double(29.88,39.38));
        pts.add(new Point2D.Double(34.18,40.41));
        pts.add(new Point2D.Double(39.26,45.36));
        pts.add(new Point2D.Double(42.28,45.56));
        pts.add(new Point2D.Double(46.10,53.40));
        pts.add(new Point2D.Double(38.95,51.54));
        pts.add(new Point2D.Double(38.79,54.43));
        pts.add(new Point2D.Double(36.88,56.08));
        poligono(pts,0);
        
        //orificio nariz
        pts.add(new Point2D.Double(25.59,49.89));
        pts.add(new Point2D.Double(27.82,48.04));
        pts.add(new Point2D.Double(27.50,45.77));
        pts.add(new Point2D.Double(25.43,47.62));
        poligono(pts, 1);
        pts.add(new Point2D.Double(31.00,47.62));
        pts.add(new Point2D.Double(33.38,49.27));
        pts.add(new Point2D.Double(34.18,47.42));
        pts.add(new Point2D.Double(31.79,45.97));
        poligono(pts,1);
        
        //trompa lado derecho
        pts.add(new Point2D.Double(46.10,53.40));
        pts.add(new Point2D.Double(42.28,45.56));
        pts.add(new Point2D.Double(46.42,39.17));//a
        pts.add(new Point2D.Double(49.12,49.69));//b
        poligono(pts,0);
        pts.add(new Point2D.Double(42.28,45.56));
        pts.add(new Point2D.Double(39.26,45.36));
        pts.add(new Point2D.Double(34.18,40.41));
        pts.add(new Point2D.Double(29.88,39.38));
        pts.add(new Point2D.Double(33.86,33.40));
        pts.add(new Point2D.Double(42.55,34.63));
        pts.add(new Point2D.Double(46.42,39.17));
        poligono(pts,0);
        //centro de la trompa
        pts.add(new Point2D.Double(29.88,39.38));
        pts.add(new Point2D.Double(33.38,34.22));
        pts.add(new Point2D.Double(28.45,35.05));
        poligono(pts,1);
        //izquierdo de la trompa
        pts.add(new Point2D.Double(29.88,39.38));
        pts.add(new Point2D.Double(28.13,33.81));
        pts.add(new Point2D.Double(24.64,34.22));
        pts.add(new Point2D.Double(22.89,40.41));
        pts.add(new Point2D.Double(24.16,44.12));
        pts.add(new Point2D.Double(26.23,40.61));
        poligono(pts,0);
        //Abajo de la trompa
        pts.add(new Point2D.Double(26.23,34.02));
        pts.add(new Point2D.Double(29.88,28.04));
        pts.add(new Point2D.Double(37.36,26.59));
        pts.add(new Point2D.Double(42.44,30.51));//inters a
        pts.add(new Point2D.Double(63.42,39.17));
        pts.add(new Point2D.Double(67.56,43.50)); //inters B
        pts.add(new Point2D.Double(49.12,49.69));
        pts.add(new Point2D.Double(46.42,39.17));
        pts.add(new Point2D.Double(42.55,34.63));
        pts.add(new Point2D.Double(33.86,33.40));
        pts.add(new Point2D.Double(33.38,34.22));
        pts.add(new Point2D.Double(28.45,35.05));
        pts.add(new Point2D.Double(28.13,33.81));   
        poligono(pts,0);
        //Cuello parte superior
        pts.add(new Point2D.Double(42.44,30.51));
        pts.add(new Point2D.Double(48.17,28.65));
        pts.add(new Point2D.Double(50.71,15.87));//inters a
        pts.add(new Point2D.Double(64.70,35.25));
        pts.add(new Point2D.Double(67.56,43.50)); //inters B
        pts.add(new Point2D.Double(63.42,39.17));
        poligono(pts,0);
        //Cuello inferior izq        
        pts.add(new Point2D.Double(50.71,15.87));
        pts.add(new Point2D.Double(51.35,1.85));
        pts.add(new Point2D.Double(61.20,2.06));//intersec a
        pts.add(new Point2D.Double(67.56,43.50));//intersec b
        pts.add(new Point2D.Double(64.70,35.25));
        poligono(pts,0);
        //Cuello Centro
        pts.add(new Point2D.Double(61.20,2.06));
        pts.add(new Point2D.Double(65.65,1.64));
        pts.add(new Point2D.Double(78.53,12.57));//inter a
        pts.add(new Point2D.Double(67.56,43.50));//intersec b
        poligono(pts,0);
        //Cuello derecho
        pts.add(new Point2D.Double(78.53,12.57));
        pts.add(new Point2D.Double(88.71,28.45));//intersec a
        pts.add(new Point2D.Double(82.03,50.72));//inters b
        pts.add(new Point2D.Double(74.56,58.76));
        pts.add(new Point2D.Double(72.97,54.63));
        pts.add(new Point2D.Double(67.56,43.50));//intersec c
        poligono(pts,0);
        //cuello derecho inferior
        pts.add(new Point2D.Double(88.71,28.45));//intersec a
        pts.add(new Point2D.Double(92.36,39.58));
        pts.add(new Point2D.Double(82.03,50.72));//inters b
        poligono(pts,0);

        //Bigotes izquierdo
        StdDraw.line(0.2464,0.4701,0.006359,0.5855);
        StdDraw.line(0.2416,0.4494,0.004769,0.4804);
        StdDraw.line(0.2289,0.4020,0.1303,0.3484);
        StdDraw.line(0.2384,0.3711,0.1605,0.3030);
        //Bigotes derecho
        StdDraw.line(0.4562,0.4886,0.8632,0.5711);
        StdDraw.line(0.4546,0.4639,0.7996,0.4247);
        StdDraw.line(0.4515,0.4412,0.6724,0.3360);
        StdDraw.line(0.4340,0.3958,0.5214,0.2824);
        StdDraw.line(0.4197,0.3773,0.4292,0.2701);
        StdDraw.line(0.3926,0.3752,0.3926,0.2247);
        
    }




    public static void poligono(ArrayList<Point2D> p,int t){
        double [] x = new double [p.size()];
        double [] y = new double [p.size()];
        for(int i =0;i<p.size();i++){
            x[i]= p.get(i).getX()/100;
            y[i]= p.get(i).getY()/100;
            StdDraw.pause(10);
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