import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanglePropertiesTest {
    RectangleTestDemo rectangle=new RectangleTestDemo();

    @Test
    public void toGetAreaTwentyWhenLengthIsFiveAndBreadthIsFour(){
        int actualArea=rectangle.area(5,4);
        int expectedArea=20;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toGetAreaSixteenWhenLengthAndBreadthAreEqualToFour(){
        int actualArea=rectangle.area(4,4);
        int expectedArea=16;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toGetZeroWhenLengthEqualToZeroAndBreadthEqualToFive(){
        int actualArea=rectangle.area(0,5);
        int expectedArea=0;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toGetZeroWhenLengthEqualToFiveAndBreadthEqualToZero(){
        int actualArea=rectangle.area(5,0);
        int expectedArea=0;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toGetZeroWhenLengthEqualToMinusFiveAndBreadthEqualToFive(){
        int actualArea=rectangle.area(-5,5);
        int expectedArea=0;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    public void toGetZeroWhenLengthEqualToMinusFiveAndBreadthEqualToMinusFive(){
        int actualArea=rectangle.area(-5,-5);
        int expectedArea=0;
        assertEquals(actualArea,expectedArea);
    }
}
