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

    @Test
    public void toGetEighteenWhenLengthEqualToFiveAndBreadthEqualToFour(){
        int actualPerimeterValue=rectangle.perimeter(5,4);
        int expectedPerimeterValue=18;
        assertEquals(actualPerimeterValue,expectedPerimeterValue);
    }

    @Test
    public void toGetSixteenWhenLengthAndBreadthAreEqualToFour(){
        int actualPerimeterValue=rectangle.perimeter(4,4);
        int expectedPerimeterValue=16;
        assertEquals(actualPerimeterValue,expectedPerimeterValue);
    }

    @Test
    public void toGetZeroWhenLengthEqualToZeroAndBreadthEqualToFour(){
        int actualPerimeterValue=rectangle.perimeter(0,4);
        int expectedPerimeterValue=0;
        assertEquals(actualPerimeterValue,expectedPerimeterValue);
    }

    @Test
    public void toGetZeroWhenLengthEqualToFourAndBreadthEqualToZero(){
        int actualPerimeterValue=rectangle.perimeter(4,0);
        int expectedPerimeterValue=0;
        assertEquals(actualPerimeterValue,expectedPerimeterValue);
    }

    @Test
    public void toGetZeroWhenAnyOneParameterIsNegative(){
        int actualPerimeterValue=rectangle.perimeter(-5,4);
        int expectedPerimeterValue=0;
        assertEquals(actualPerimeterValue,expectedPerimeterValue);
    }
}
