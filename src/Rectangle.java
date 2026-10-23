public class Rectangle extends Point{
    private int width;
    private int heigth;

    public Rectangle(){
        super();
        width = 0;
        heigth = 0;
    }

    public Rectangle(Point point, int newWidth, int newHeight){
        super(point.getX(), point.getY());
        width = newWidth;
        heigth = newHeight;
    }

    public Rectangle(Point p1, Point p2){
        super(p1.getX(), p1.getY());
        width = p2.getX() - p1.getX();
        heigth = p2.getY() - p1.getY();
    }

    public Rectangle(Segment segment){
        super();
        int x, y;
        Point starPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();
        if (starPoint.getX() < endPoint.getX()){
            x = starPoint.getX();
            width = endPoint.getX() - starPoint.getX();
        } else {
            x = endPoint.getX();
            width = starPoint.getX() - endPoint.getX();
        }
        if (starPoint.getY() < endPoint.getY()){
            y = starPoint.getY();
            heigth = endPoint.getY() - starPoint.getY();
        } else {
            y = endPoint.getY();
            heigth = starPoint.getY() - endPoint.getY();
        }
        setX(x);
        setY(y);
        //setX(segment.getStartPoint().getX() < segment.getEndPoint().getX() ? segment.getStartPoint().getX() : segment.getEndPoint().getX());
        //setY(segment.getStartPoint().getY() < segment.getEndPoint().getY() ? segment.getStartPoint().getY() : segment.getEndPoint().getY());
    }

    @Override
    public String toString() {

        return super.toString() + " width: " + width + " heigth: " + heigth;
    }
    public int getArea(){
        return heigth*width;
    }
}
