public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint();
        MovablePoint point1= new MovablePoint(3,4);
        System.out.println(point1);
        point1.move();
        System.out.println(point1);
        MovablePoint point2 = new MovablePoint(2,3,4,5);
        System.out.println(point2);
        point2.move();
        System.out.println(point2);


    }
}
