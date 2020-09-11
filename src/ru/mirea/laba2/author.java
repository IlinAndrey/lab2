package ru.mirea.laba2;
import java.lang.*;

public class author<gender> {
    private String name;
    private String email;
    private char gender;
    private String genderNew;
    public author(String n, String e, char g){
        name=n;
        email=e;
        gender=g;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void SeGender(char gender){
        if (gender == 'm')
            genderNew = "male";
        else
            genderNew = "female";

    }
    public String toString(){
        SeGender(gender);
        return this.name+"'s a "+this.genderNew+" and have email: "+this.email;
    }
}
