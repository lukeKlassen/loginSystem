/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

/**
 *
 * @author 070035266
 */
public class User {
  //Strings holding the user's information
    //user Name (How they login)
    private final String userName;
    //first name
    private final String fName;
    //last name
    private final String lName;
    //their MD5 encrypted password
    private final String password;
    //constructs a user with all required information
    public User(String userName, String fName, String lName, String password){
        //assign the given values to their fields
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
        this.password = password;
    }
    //Getters For all user Information
    public String getUserName() {
        return userName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPassword() {
        return password;
    }
    //allows a user's information to be printed to a file with this method call
    //UNUSED
    @Override
    public String toString(){
        return userName + "," + fName + "," + lName + "," + password;
    }
    
}
