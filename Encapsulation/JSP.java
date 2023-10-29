package Encapsulation;

import Encapsulation.encapsulatedFiles.Database;

public class JSP {

    public static void main(String[] args){
        Database connection = new Database("heroku",null,"chax","L0calH0st");
        connection.createConnection(connection.getServer(),connection.getDatabase(),connection.getUsername(),connection.getPassword());
        System.out.println("Connection status: "+ connection.connectionStatus().toString());
    }
}
