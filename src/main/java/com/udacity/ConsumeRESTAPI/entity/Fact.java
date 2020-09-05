package com.udacity.ConsumeRESTAPI.entity;

public class Fact {
    private int number;
    private boolean found;
    private String type;
    private String text;

    public Fact(){}

    public Fact(String text, boolean found, String type, int number){
        this.text = text;
        this.found = found;
        this.type = type;
        this.number = number;
    }


    public void setText(String text)
    {
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setFound(boolean found)
    {
        this.found = found;
    }

    public boolean getFound(){
        return this.found;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public String toString() {
        return "Fact{" +
                "text=" + text +
                ", type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", found='" + found + '\'' +
                '}';
    }
}
