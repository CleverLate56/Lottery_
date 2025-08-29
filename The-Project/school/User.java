/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;
import java.io.*;

/**
 *
 * @author sibab
 */
public class User implements Serializable 
{
   private String name; 
   private String surname; 
   private int age; 
   private String userID; 

    public User(String name, String surname, int age, String userID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.userID = userID;
    }

    public String getName() {
        
     
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getUserID() {
        return userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
   
        
   
}
