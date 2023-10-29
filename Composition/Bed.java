package Composition;

public class Bed {
    private String material;

    private String type;
    private Dimensions bedDimensions;

    public Bed(String material, String type, Dimensions bedDimensions) {
        this.material = material;
        this.type = type;
        this.bedDimensions = bedDimensions;
    }
    //getters

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public Dimensions getBedDimensions() {
        return bedDimensions;
    }
}
