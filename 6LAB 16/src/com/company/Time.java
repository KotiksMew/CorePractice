package com.company;

public class Time {
    private int hours;
    private int minuts;
    private int secunds;

    public Time(int hours, int minuts, int secunds){
        this.secunds=secunds%60;
        this.minuts=minuts%60;
        this.hours=hours%24;
    }

    //Input/output
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours%24;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts%60;
    }

    public int getSecunds() {
        return secunds;
    }

    public void setSecunds(int secunds) {
        this.secunds = secunds%60;
    }
    //
    public void addHours() {this.hours=(hours+1)%24;}
    public void addMinuts() {this.minuts=(minuts+1)%60;}
    public void addSecunds(){this.secunds=(secunds+1)%60;}

}
