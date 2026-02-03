class Area {
    void area(double side) {
        System.out.println("Area of Square = " + (side * side));
    }
    void area(double length, double breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
    void area(int radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(5);          // Square
        obj.area(6.5, 4.0);   // Rectangle
        obj.area(7);          // Circle
    }
}
