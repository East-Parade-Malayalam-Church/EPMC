package com.example.epmc;

public class Dirglob {

    // Global variables
    private String FID,Name,DOB,Address,Area,Relation,Wedding,Cell,Bgroup,Hparish,Fname,Profession,Email,Picture;

    public Dirglob()
    {

    }

    public Dirglob(String FID, String Name, String DOB, String Address, String Area, String Relation, String Wedding, String Cell, String Bgroup,
                   String Hparish, String Fname, String Profession, String Email,String Picture) {
        this.Address = Address;
        this.Area = Area;
        this.Bgroup = Bgroup;
        this.Cell = Cell;
        this.DOB = DOB;
        this.Email = Email;
        this.FID = FID;
        this.Fname = Fname;
        this.Name = Name;
        this.Hparish = Hparish;
        this.Profession = Profession;
        this.Wedding = Wedding;
        this.Relation = Relation;
        this.Picture = Picture;
    }

    public String getFID() {
        return FID;
    }

    public void setFID(String FID) {
        this.FID = FID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getRelation() {
        return Relation;
    }

    public void setRelation(String relation) {
        Relation = relation;
    }

    public String getWedding() {
        return Wedding;
    }

    public void setWedding(String wedding) {
        Wedding = wedding;
    }

    public String getCell() {
        return Cell;
    }

    public void setCell(String cell) {
        Cell = cell;
    }

    public String getBgroup() {
        return Bgroup;
    }

    public void setBgroup(String bgroup) {
        Bgroup = bgroup;
    }

    public String getHparish() {
        return Hparish;
    }

    public void setHparish(String hparish) {
        Hparish = hparish;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }
}
