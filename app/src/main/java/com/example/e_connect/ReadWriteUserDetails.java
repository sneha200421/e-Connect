package com.example.e_connect;

public class ReadWriteUserDetails {
    public String  dob, gender, mobile;
    public ReadWriteUserDetails(){};

    public ReadWriteUserDetails(String textDob, String textGender, String textMobile){

        this.dob = textDob;
        this.gender = textGender;
        this.mobile = textMobile;
    }
}
