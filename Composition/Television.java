package Composition;

public class Television {
    private Resolution nativeResolution;
    private Dimensions teleDimensions;
    private String type;

    //there can only be two types of Tv


    public Television(Resolution nativeResolution, Dimensions teleDimensions, String type) {
        this.nativeResolution = nativeResolution;
        this.teleDimensions = teleDimensions;
        this.type = type;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public Dimensions getTeleDimensions() {
        return teleDimensions;
    }

    public String getType() {
        return type;
    }
}
