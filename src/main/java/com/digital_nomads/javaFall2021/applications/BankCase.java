package com.digital_nomads.javaFall2021.applications;

public abstract class BankCase  implements Bank{
    private String phoneNumber;

    public BankCase(String phoneNumber) throws Exception {
        if(phoneNumber.length() != 13 || !phoneNumber.startsWith("+")){
            throw new Exception("Phone number is invalid");
        } else{
            this.phoneNumber = phoneNumber;
        }

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
