/******************************************************************************
 *  Compilation:  javac Fade.java
 *  Execution:    java Fade n image1.jpg image2.jpg
 *  Data files:   https://introcs.cs.princeton.edu/31datatype/darwin.jpg
 *                https://introcs.cs.princeton.edu/31datatype/mandrill.jpg
 *
 *  Produce animated effect, fading from image1.jpg to image2.jpg,
 *  using n-1 intermediate frames.
 *  
 * javac Fade.java
 * java Fade tiempoTransicción figura1.jpg figura2.jpg ... figuraN-1.jpg  
 * 
 *
 ******************************************************************************/

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;

public class Fade {

    public static Color combine(Color c1, Color c2, double alpha) {
        int r = (int) (alpha * c1.getRed()   + (1 - alpha) * c2.getRed());
        int g = (int) (alpha * c1.getGreen() + (1 - alpha) * c2.getGreen());
        int b = (int) (alpha * c1.getBlue()  + (1 - alpha) * c2.getBlue());
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        
        int size = args.length;
        ArrayList<Picture> picture = new ArrayList<Picture>();
        for(int i =1 ; i < size; i++){
            picture.add(new Picture(args[i]));
        }
        int n = Integer.parseInt(args[0]);
        int width  = picture.get(1).width();
        int height = picture.get(1).height();
        Picture picture0 = new Picture(width,height);
            
        while(true){
            for(int i = 0;i< size-2; i++){
                for (int k = 0; k <= n; k++) {
                    double alpha = 1.0 * k / n;
                    for (int col = 0; col < width; col++) {
                        for (int row = 0; row < height; row++) {
                            Color c1 = picture.get(i).get(col,row);
                            Color c2 = picture.get(i+1).get(col,row);
                            picture0.set(col, row, combine(c2, c1, alpha));
                            picture0.show();
        
                        }
                    }
                }
            }
        }
    }
}
