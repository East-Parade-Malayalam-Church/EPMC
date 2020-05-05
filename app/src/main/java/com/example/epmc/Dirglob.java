package com.example.epmc;

public class Dirglob {

    private static Dirglob instance;
    // Global variables
    private String name,dob,address,area,relation,wedding,bgroup,hparish,fname,profession,email,picture;
    private long cell;
    private int fid;

    public Dirglob(int fid, String name, String dob, String address, String area, String relation, String wedding, long cell, String bgroup,
                   String hparish, String fname, String profession, String email, String picture) {
        this.fid = fid;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.area = area;
        this.relation = relation;
        this.wedding = wedding;
        this.cell = cell;
        this.bgroup = bgroup;
        this.hparish = hparish;
        this.fname = fname;
        this.profession = profession;
        this.email = email;
        this.picture = picture;
    }

    public Dirglob()
    { }

    public static synchronized Dirglob getInstance() {
        if(instance==null) {
            instance = new Dirglob();
        }
        return instance;
    }

    public void setData(int fid,String name,String address,String wedding,long cell,String bgroup,String hparish,String fname,
                        String profession,String email,String picture){
        this.fid=fid;
        this.name=name;
        this.address=address;
        this.wedding=wedding;
        this.cell=cell;
        this.bgroup=bgroup;
        this.hparish=hparish;
        this.fname=fname;
        this.profession=profession;
        this.email=email;
        this.picture=picture;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getWedding() {
        return wedding;
    }

    public void setWedding(String wedding) {
        this.wedding = wedding;
    }

    public long getCell() {
        return cell;
    }

    public void setCell(long cell) {
        this.cell = cell;
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup;
    }

    public String getHparish() {
        return hparish;
    }

    public void setHparish(String hparish) {
        this.hparish = hparish;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
