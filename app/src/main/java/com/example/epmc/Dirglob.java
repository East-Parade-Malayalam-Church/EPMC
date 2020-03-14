package com.example.epmc;

public class Dirglob {
    private static Dirglob instance;

    // Global variables
    private String address,area,bg,cell,dob,email,fid,famname,fullname,hp,prof,wedding,rel;

    // Restrict the constructor from being instantiated
    private Dirglob(){}

    public static synchronized Dirglob getInstance() {
        if(instance==null) {
            instance=new Dirglob();
        }
        return instance;
    }

    public void setData(String address,String area,String bg,String cell,String dob,String email,String fid,String famname,String fullname,
                        String hp,String prof,String wedding,String rel){
        this.address=address;
        this.area=area;
        this.bg=bg;
        this.cell=cell;
        this.dob=dob;
        this.email=email;
        this.fid=fid;
        this.famname=famname;
        this.fullname=fullname;
        this.hp=hp;
        this.prof=prof;
        this.wedding=wedding;
        this.rel=rel;
    }

    public String getAddress(){
        return this.address;
    }

    public String getArea(){
        return this.area;
    }

    public String getBg(){
        return this.bg;
    }

    public String getCell(){
        return this.cell;
    }

    public String getDob(){
        return this.dob;
    }

    public String getEmail(){
        return this.email;
    }

    public String getFid(){
        return this.fid;
    }

    public String getFamname() {
        return this.famname;
    }

    public String getFullname() {
        return this.fullname;
    }

    public String getHp() {
        return this.hp;
    }

    public String getProf() {
        return this.prof;
    }

    public String getWedding() {
        return this.wedding;
    }

    public String getRel() {
        return this.rel;
    }

}
