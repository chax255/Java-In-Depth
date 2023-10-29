package Composition;

public class Door {
    private String type;
    private String material;
    private  Dimensions doorDimensions;
    private String doorLocation;

    //constructor


    public Door(String type, String material, Dimensions doorDimensions, String doorLocation) {
        this.type = type;
        this.material = material;
        this.doorDimensions = doorDimensions;
        this.doorLocation = doorLocation;
    }
    //

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDoorDimensions() {
        return doorDimensions;
    }

    public String getDoorLocation() {
        return doorLocation;
    }
}
