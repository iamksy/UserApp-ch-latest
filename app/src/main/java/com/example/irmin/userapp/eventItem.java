package com.example.irmin.userapp;

public class eventItem {
    private  String title2;
    private  String content2;
    private  String amount2;

    public String getTitle2(){
        return title2;
    }

    public String getContent2(){
        return content2;
    }

    public String getAmount2(){ return amount2; }

    public eventItem(String title2, String content2, String amount2){
        this.title2 = title2;
        this.content2 = content2;
        this.amount2 = amount2;
    }
}
