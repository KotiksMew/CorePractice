package com.company; //12, 13, 4, 5, 7, 8
public class Main {


    public static void main(String[] args) {

        Time time=new Time(1213,115259,1125215);
time.addHours();
time.addMinuts();
time.addSecunds();

        System.out.println(time.getHours()+":"+time.getMinuts()+":"+time.getSecunds());
        }


}

