package Composition;

import java.awt.*;

public class Room {
    private Bed sofaBed;
    private Sofa sofaCoach;
    private Television hitachiTv;
   private Dimensions roomDimensions;
    private Dirisha glassWindow;
    private Fan roofFan;
    private WashRoom selfWashRoom;
    private Door door;

    public Room(Bed sofaBed, Sofa sofaCoach, Television hitachiTv, Dimensions roomDimensions, Dirisha glassWindow, Fan roofFan, WashRoom selfWashRoom, Door door) {
        this.sofaBed = sofaBed;
        this.sofaCoach = sofaCoach;
        this.hitachiTv = hitachiTv;
        this.roomDimensions = roomDimensions;
        this.glassWindow = glassWindow;
        this.roofFan = roofFan;
        this.selfWashRoom = selfWashRoom;
        this.door = door;
    }

    public Bed getSofaBed() {
        return sofaBed;
    }

    public Sofa getSofaCoach() {
        return sofaCoach;
    }

    public Television getHitachiTv() {
        return hitachiTv;
    }

    public Dimensions getRoomDimensions() {
        return roomDimensions;
    }

    public Dirisha getGlassWindow() {
        return glassWindow;
    }

    public Fan getRoofFan() {
        return roofFan;
    }

    public WashRoom getSelfWashRoom() {
        return selfWashRoom;
    }

    public Door getDoor() {
        return door;
    }
    //printers
    public void printSofaData(double b, double w,double h){
        this.getSofaBed().getBedDimensions().setBedHeight(b);
        this.getSofaBed().getBedDimensions().setBedWidth(w);
        this.getSofaBed().getBedDimensions().setBedBreadth(h);

        System.out.println(
                "Dimensions of my sofa are "+
                        this.getSofaBed().getBedDimensions().getSofaBreadth() +" x "+
                        this.getSofaBed().getBedDimensions().getSofaHeight()+" x "+
                        this.getSofaBed().getBedDimensions().getSofaWidth()+ ". \n"+
                        " Its made up of "+   this.getSofaBed().getMaterial()+" \n"+
                        "Its of "+this.getSofaBed().getType()+" type."
        );
    }
    public void printBedData(double b,double w,double h){
        this.getSofaBed().getBedDimensions().setSofaBreadth(b);
        this.getSofaBed().getBedDimensions().setSofaWidth(w);
        this.getSofaBed().getBedDimensions().setSofaHeight(h);
        System.out.println(
                "Dimensions of my bed are "+
                        this.getSofaBed().getBedDimensions().getBedBreadth() +" x "+
                        this.getSofaBed().getBedDimensions().getBedHeight()+" x "+
                        this.getSofaBed().getBedDimensions().getBedWidth()+ ". \n"+
                        " Its made up of "+ this.getSofaBed().getMaterial()+" \n"+
                        "Its of "+this.getSofaBed().getType()+" type."
        );
    }
    //Tv data
    public void printTvInfo(){

        System.out.println(
                "My Television has a resolution of "+
                        this.getHitachiTv().getNativeResolution().getX_axis() +" x "+
                        this.getHitachiTv().getNativeResolution().getY_axis()+" x "+
                        this.getHitachiTv().getNativeResolution().getPixels()+ ". \n"+
                        " Its size is "+ this.getHitachiTv().getTeleDimensions().getHeightInInches()+" x "+this.getHitachiTv().getTeleDimensions().getWidthInInches()+"\n"+
                        "Its of "+   this.getHitachiTv().getType()+" type."
        );
    }
}
