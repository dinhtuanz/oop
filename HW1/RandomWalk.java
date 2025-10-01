import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import java.awt.Color;
import java.util.Random;

public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.WHITE);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        int f = 0;
        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(x, y, 0.45);
            
            
            if(steps == 0 ) {
                 x--;
            }
            else if ( y == -f && x != f) x++;
            else if ( y == f && x != -f ) x--;
            else if ( x == f && y != f ) y++;
            else if ( x == -f && y != -f) y--;
            else x++;
            if( Math.sqrt(steps) % 2 == 1) {
                 f++;
            }
            steps++;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(40);
        }
        StdOut.println("Total steps = " + steps);
    }

}
