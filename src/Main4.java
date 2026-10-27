public class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.moveTo(4, 7);
        System.out.println("Caso R:");
        System.out.println(r);
        Rectangle r2 = new Rectangle(new Point(1, 1), 8, 6 );
        System.out.println("Caso R2:");
        System.out.println(r2);
        Rectangle r3 = new Rectangle(new Point(2,0), new Point(4,2));
        System.out.println("Caso R3:");
        System.out.println(r3);
        Rectangle r4 = new Rectangle(new Segment(new Point(2,2), new Point(4, 0)));
        System.out.println("Caso R4:");
        System.out.println(r4);
        System.out.println(r4.getArea());
        System.out.println(r4.getPoint());
        Rectangle r5 = new Rectangle(new Segment(new Point(1,1), new Point(3, 3)));
        System.out.println("Caso R5:");
        System.out.print(r5.getTLP());
        System.out.print("---" + r5.getTRP());
        System.out.println();
        System.out.println("|          |");
        System.out.print(r5.getBLP());
        System.out.print("---" + r5.getBRP());
    }
}
