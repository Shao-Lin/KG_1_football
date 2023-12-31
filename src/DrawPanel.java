import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;

    private Gates gates;
    private Human human;
    private Ball ball;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(5, this);
        timer.start();

        this.gates = new Gates( 800, 400);
        this.human = new Human( 50, 400);
        this.ball = new Ball(100,400);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        gr.setColor(new Color(123, 104, 238));
        gr.fillRect(0,0,getWidth(),getHeight());
        gr.setColor(new Color(218, 165, 32));
        gr.fillRect(0, (int) (getHeight() * 0.6),getWidth(),getHeight());
        gates.draw(gr);
        human.humanDraw(gr);
        ball.setX(ticksFromStart);
        ball.draw(gr);

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
//            ball.updateWorld();
            renderWorld();
            ++ticksFromStart;
        }
    }

    private void renderWorld() {
        repaint();
    }
}
