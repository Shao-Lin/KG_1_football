import java.awt.*;

public class Ball {
    private int x;
    private int y;


    public Ball(final int x, final int y) {
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
        g.setColor(new Color(0, 0, 0));
        g.fillOval(this.x + 100,this.y + 80,40,40);
        g.setColor(Color.WHITE);
        g.fillOval(this.x + 105,this.y + 85,30,30);
        g.setColor(Color.BLACK);
        g.drawOval(this.x + 105,this.y + 85,30,30);
        g.drawOval(this.x + 100,this.y + 80,40,40);

        g.fillOval(this.x + 112,this.y + 93,15,15);
    }
}
