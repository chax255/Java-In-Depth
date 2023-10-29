package Encapsulation.encapsulatedFiles;

public class Database {
    //private fields
    private String server;
    private String database;
    private String username;
    private String password;

    public Database(String server,String database,String username, String password){
        this.server = server;
        this.database =server;
        this.username =username;
        this.password = password;
    }

    public void createConnection(String server,String database,String username,String password){
        if(server !=null){
            if(database != null){
                if(username != null){
                    if(password != null){
                        System.out.println("Connected successfully");
                        connectionStatus();
                    }
                    else{
                        System.out.println("Password is not given");
                    }
                }
                else{
                    System.out.println("User not known");
                }
            }
            else{
                System.out.println("database not present in the system");
            }
        }
        else{
            System.out.println(
                    "Server is down"
            );
        }
    }
    public void setDatabase(String database){
        this.database = database;
    }
    public void setServer(String server){
        this.server = server;
    }
    public void setUsername(String username){
        this.username =username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getDatabase(){
        return this.database;
    }
    public String getUsername(){
        return this.username;
    }
    public String getServer(){
        return this.server;
    }
    public String getPassword(){
        return this.password;
    }
    public String connectionStatus(){
        if (this.server != null && this.database != null && this.username != null && this.password !=null){
            return "Connection running";
        }
        else{
            return "Connection not running";
        }

    }

}
