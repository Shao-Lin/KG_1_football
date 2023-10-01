import java.awt.*;

public class Gates {

    private int x;
    private int y;


    public Gates(final int x, final int y) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.BLACK);
        g.fillRect(800,300,20,250);

        g.fillRect(800,300,200,15);
    }
}