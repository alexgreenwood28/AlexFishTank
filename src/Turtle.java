import java.awt.*;

public class Turtle {

    String name;
    Image aliveimage;
    Image deadImage;
    int xpos;
    int ypos;
    int speed;
    double dx;
    double dy;
    int width;
    int height;
    boolean isAlive=true;
    int time=0;
    Rectangle hitbox;

    public Turtle() {
        hitbox = new Rectangle(xpos, ypos, width, height);
    }

    public Turtle(int xposInput, int yposInput, double dxInput, double dyInput, int widthInput, int heightInput) {
        xpos = xposInput;
        ypos = yposInput;
        dx = dxInput;
        dy = dyInput;
        width = widthInput;
        height = heightInput;

        hitbox = new Rectangle(xpos, ypos, width, height);
    }

    public void move() {
        xpos = xpos + (int) dx;
        ypos = ypos + (int) dy;
        if (xpos >= 900) {
            dx = -dx;
        }

        if (xpos <= 0) {
            dx = -dx;
        }
        if (ypos <= 0) {
            dy = -dy;
        }
        if (ypos >= 600) {
            dy = -dy;
        }
        hitbox = new Rectangle(xpos, ypos, width, height);
    }

}