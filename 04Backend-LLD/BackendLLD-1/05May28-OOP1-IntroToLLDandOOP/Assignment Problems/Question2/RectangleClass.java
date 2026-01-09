import java.awt.*;

public class RectangleClass {
    Point topLeft;
    int height;
    int width;

    public int getArea(){
        return height*width;
    }
    public int getPerimeter(){
        return 2*(height+width);
    }
    public Point getBottomRight(){
        return new Point(topLeft.x+width,topLeft.y+height);
    }
}