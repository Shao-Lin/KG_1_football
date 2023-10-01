import java.awt.*;

public class Human {
    private int x;
    private int y;

    public Human(final int x, final int y) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    void humanDraw(final Graphics gr){
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.BLACK);
        g.fillOval(50,450,10,60);
        g.drawOval(50,450,10,60);           // нога 1

        g.setColor(new Color(255, 0, 0));
        g.drawOval(50,502,15,10);
        g.fillOval(50,502,15,10);           //кроссовок


        g.setColor(Color.BLACK);
        g.fillOval(70,450,10,60);
        g.drawOval(70,450,10,60);          // нога 2


        g.setColor(new Color(255, 0, 0));
        g.drawOval(70,502,15,10);
        g.fillOval(70,502,15,10);          //кроссовок 2


        g.setColor(new Color(0, 100, 0));
        g.drawRect(40,390,50,60);       //  тело
        g.fillRect(40,390,50,60);

        g.setColor(new Color(240, 230, 140));
        g.drawOval(40,360,50,30);       // голова
        g.fillOval(40,360,50,30);


        g.drawLine(40,400,5,420);
        g.drawLine(90,400,130,420);         //руки


        g.setColor(Color.BLACK);
        g.drawOval(50,370,6,6);
        g.drawOval(75,370,6,6);         //глаза

        g.drawOval(53,380,20,5);        //рот
    }
}
