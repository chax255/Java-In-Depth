package Composition;

public class WashRoom {
    private Dirisha dirisha;
    private Dimensions size;
    private String toiletType;
    private boolean shower;
    private boolean mirror;

    public WashRoom(Dirisha dirisha, Dimensions size, String toiletType, boolean shower, boolean mirror) {
        this.dirisha = dirisha;
        this.size = size;
        this.toiletType = toiletType;
        this.shower = shower;
        this.mirror = mirror;
    }

    public Dirisha getDirisha() {
        return dirisha;
    }

    public Dimensions getSize() {
        return size;
    }

    public String getToiletType() {
        return toiletType;
    }

    public boolean isShower() {
        return shower;
    }

    public boolean isMirror() {
        return mirror;
    }
}
