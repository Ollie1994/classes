public class Rectangle {
    private double width;
    private double height;
    public void setWidth(double newWidth) {
        if (newWidth >= 0) {
            width = newWidth;
        }
        else {
            System.out.println("give me a positive number");
        }
    }
    public void setHeight(double newHeight) {
        if (newHeight >= 0) {
            height = newHeight;
        }
        else {
            System.out.println("give me a positive number");
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }


    double calculateArea() {
        return width * height;
    }


}
