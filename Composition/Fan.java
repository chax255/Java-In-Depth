package Composition;

public class Fan {
    private Dimensions fanRadius;
    private String type;
    private String position;

    public Fan(Dimensions fanRadius, String type, String position) {
        this.fanRadius = fanRadius;
        this.type = type;
        this.position = position;
    }

    public Dimensions getFanRadius() {
        return fanRadius;
    }

    public String getType() {
        return type;
    }

    public String getPosition() {
        return position;
    }
}
