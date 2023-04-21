package oo.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

        circle.setRadius(20);

        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
