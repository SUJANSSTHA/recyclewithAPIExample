package com.example.recyclewithapiexample;

public class Contact {
    private int Id;
    private String Name;
    private String Phone;
    public Contact(){

    }
    public Contact(int Id, String Name,String Phone){
        this.Id=Id;
        this.Name=Name;
        this.Phone = Phone;

    }
    public int getId(int Id){
        return Id;
    }
    public String getName(){
        return  Name;
    }
    public  String getPhone(){
        return Phone;
    }
    public void  setName(String Name){
        this.Name = Name;
    }
    public  void setPhone(String Phone){
        this.Phone = Phone;
    }

}
