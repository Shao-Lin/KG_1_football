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

        g.setColor(Color.BLACK);
        g.fillRect(800,300,200,15);







        // bag
//        g.setColor(this.color);
//        g.fillOval(this.x, (int)(this.y + 0.25 * this.height), (int)(0.33 * this.width), (int)(0.5 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawOval(this.x, (int)(this.y + 0.25 * this.height), (int)(0.33 * this.width), (int)(0.5 * this.height));
//
//        // head
//        g.setColor(this.color);
//        g.fillOval((int)(this.x + 0.2 * this.width), this.y, (int)(0.75 * this.width), (int)(0.5 * height));
//        g.setColor(Color.BLACK);
//        g.drawOval((int)(this.x + 0.2 * this.width), this.y, (int)(0.75 * this.width), (int)(0.5 * height));
//
//        // legs
//        g.setColor(this.color);
//        g.fillRect((int)(this.x + 0.2 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//        g.fillRect((int)(this.x + 0.65 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawRect((int)(this.x + 0.2 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//        g.drawRect((int)(this.x + 0.65 * this.width), (int)(this.y + 0.5 * this.height),
//                (int)(0.3 * this.width), (int)(0.5 * this.height));
//
//        // body
//        g.setColor(this.color);
//        g.fillRect((int)(this.x + 0.2 * this.width), (int)(this.y + 0.25 * this.height),
//                (int)(0.75 * this.width), (int)(0.5 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawLine((int)(this.x + 0.2 * this.width), (int)(this.y + 0.25 * this.height),
//                (int)(this.x + 0.2 * this.width), (int)(this.y + 0.75 * this.height));
//        g.drawLine((int)(this.x + 0.95 * this.width), (int)(this.y + 0.25 * this.height),
//                (int)(this.x + 0.95 * this.width), (int)(this.y + 0.75 * this.height));
//        g.drawLine((int)(this.x + 0.45 * this.width), (int)(this.y + 0.75 * this.height),
//                (int)(this.x + 0.7 * this.width),(int)(this.y + 0.75 * this.height));
//
//        // eyes
//        g.setColor(new Color(135,206,250));
//        g.fillOval((int)(this.x + 0.5 * this.width), (int)(this.y + 0.16 * this.height),
//                (int)(0.55 * this.width), (int)(0.25 * this.height));
//        g.setColor(Color.BLACK);
//        g.drawOval((int)(this.x + 0.5 * this.width), (int)(this.y + 0.16 * this.height),
//                (int)(0.55 * this.width), (int)(0.25 * this.height));
    }
}