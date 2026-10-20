public class Main3 {
    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(6,8);
        Segment segment = new Segment(p1, p2);
        segment.setOffset(4, 4);
        System.out.println(segment.toString());
        System.out.println(segment.getModule());
    }
}
