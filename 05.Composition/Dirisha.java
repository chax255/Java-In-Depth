package Composition;

public class Dirisha {
    private String material;
    private Dimensions windowDimensions;
    private String typeOfLock;
    private String windowLocation;

    //constructor

    public Dirisha(String material, Dimensions windowDimensions, String typeOfLock, String windowLocation) {
        this.material = material;
        this.windowDimensions = windowDimensions;
        this.typeOfLock = typeOfLock;
        this.windowLocation = windowLocation;
    }

    //getters

    public String getMaterial() {
        return material;
    }

    public Dimensions getDoorDimensions() {
        return windowDimensions;
    }

    public String getTypeOfLock() {
        return typeOfLock;
    }

    public String getDoorLocation() {
        return windowLocation;
    }
}
