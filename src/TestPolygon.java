public class TestPolygon {
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(0,1);
        points[1] = new Point(1,2);
        points[2] = new Point(2,3);
        points[3] = new Point(3,4);

        Polygon p = new Polygon(points);
        System.out.println(p);
        System.out.println(p.getLength());
        p.setOffset(2,2);
        System.out.println(p);

    }

}
