package ru.stepup.coordinate;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);
        System.out.print(p1+" ");
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.print(p2+" ");
        System.out.println(p3);
        System.out.println(p2==p3);

    }
}
