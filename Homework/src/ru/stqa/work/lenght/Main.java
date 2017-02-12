package ru.stqa.work.lenght;

/**
 * Created by ioK on 11.02.2017.
 */
public class Main {

  public static void main(String[] args) {
    Point p1 = new Point(4, 5);
    Point p2 = new Point(7, 7);
    System.out.println("Длина отрезка = " + distance(p1, p2));

  }

  public static double distance(Point p1, Point p2) {
    double len = Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
    return len;
  }

}
