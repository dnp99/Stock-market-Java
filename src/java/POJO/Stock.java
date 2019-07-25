package POJO;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patel
 */
public class Stock implements Serializable{

    private double open,high,low,close;
    private String timestamp,companyName;
    private int volume;
    
    
    public double getOpen() {
        return open;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Stock(String name,double open, double high, double low, double close, String timestamp, int volume) {
        this.open = open;
        this.companyName=name;
        this.high = high;
        this.low = low;
        this.close = close;
        this.timestamp = timestamp;
        this.volume = volume;
    }
    
    public Stock()
    {
        
    }
    
    @Override
    public String toString()
    {
        return companyName+"\n "+" Date:" +timestamp
                +"\n "+" High: " +high
                +"\n "+" Low: " +low
                +"\n "+" Open: " +open
                +"\n "+" Close: "+close
                +"\n "+" Volume: " +volume
                ;
    }
}
