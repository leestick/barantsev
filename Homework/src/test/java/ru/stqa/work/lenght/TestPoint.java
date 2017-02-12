package ru.stqa.work.lenght;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ioK on 12.02.2017.
 */
public class TestPoint {
  @Test
  public void testDistance() {
    Point s1 = new Point(5, 5);
    Point s2 = new Point(7, 7);
    Assert.assertEquals(Main.distance(s1, s2), 2.8284271247461903);

  }

}
