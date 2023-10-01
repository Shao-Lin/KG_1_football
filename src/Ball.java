import java.awt.*;

public class Boll {
    private int x;
    private int y;


    public Boll(final int x, final int y) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void draw(final Graphics gr){
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(255, 0, 255));
        g.fillOval(100,500,30,30);
    }
}
