public class RectangleTestDemo {
    public int area(int length, int breadth) {
        if(length>0 && breadth>0)
        return length*breadth;
        else
            return 0;
    }

    public int perimeter(int length, int breadth) {
        if(length>0 && breadth>0)
            return 2*(length+breadth);
        else
            return 0;
    }
}
