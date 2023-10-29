package Composition;

public class Resolution {
    private double x_axis;
    private double y_axis;
    private String pixels;

    public Resolution(double x_axis, double y_axis, String pixels) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.pixels = pixels;
    }

    public void showPictureAt(){
        System.out.println(
                "Now drawing an image at "+this.getX_axis()+" x "+this.getY_axis()+" "+getPixels()
        );
    }

    public double getX_axis() {
        return x_axis;
    }

    public double getY_axis() {
        return y_axis;
    }

    public String getPixels() {
        return pixels;
    }
}
