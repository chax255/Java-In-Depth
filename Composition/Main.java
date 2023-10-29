package Composition;

import org.w3c.dom.ranges.DocumentRange;

public class Main {
    public static void main(String[] args){
        //Bed
        Dimensions bedDimensions = new Dimensions();
        Bed sofaBed = new Bed("Mninga","Normal",bedDimensions);
        //Window
        Dimensions windowDimensions = new Dimensions();
        Dirisha glassWindow = new Dirisha("Aluminium",windowDimensions,"Electronic","Room");
        //Television
        Dimensions teleDimensions = new Dimensions();
        Resolution nativeResolution = new Resolution(14.5,90.5,"1020");
        Television hitachiTv = new Television(nativeResolution,teleDimensions,"SmartTv");
        //Sofa
        Sofa sofaCoach = new Sofa("sponge",bedDimensions,"Living Room");

        //BedRoomWindow
        //BedRoomDoor
        Dimensions doorDimensions = new Dimensions();
        //BedRoom
        Dimensions dirishaDimensions = new Dimensions();
        Dimensions size = new Dimensions();
        Door door = new Door("Wood","Mninga",doorDimensions,"Room");
        Dimensions roomDimensions = new Dimensions();
        Dirisha dirisha = new Dirisha("Timber",dirishaDimensions,"slider","top");
        //BirthRoom
        WashRoom selfWashRoom = new WashRoom(dirisha,size,"Sitting",true,true);
        //BirthroomWindow

        Dimensions dimensions = new Dimensions();

        Dimensions fanRadius = new Dimensions();

        Fan roofFan = new Fan(fanRadius,"hangingRoof","Ceiling");




       //main Object
        Room ghettoKali = new Room(sofaBed,sofaCoach,hitachiTv,roomDimensions,glassWindow,roofFan,selfWashRoom,door);
//the sofaBed Dimensions
  //done
//sofaCoach Dimensions
        //done
//sofaCoach Dimensions
        //done
        ghettoKali.printBedData(3,5,6);
        ghettoKali.printTvInfo();
        ghettoKali.printBedData(6,6,3);







    }
}
