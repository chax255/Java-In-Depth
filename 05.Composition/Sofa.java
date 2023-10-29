package Composition;

public class Sofa {
    private String material;
    private Dimensions bedDimensions;
    private String type;

    //constructor


    public Sofa(String material, Dimensions bedDimensions, String type) {
        this.material = material;
        this.bedDimensions = bedDimensions;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getBedDimensions() {
        return bedDimensions;
    }

    public String getType() {
        return type;
    }
}
