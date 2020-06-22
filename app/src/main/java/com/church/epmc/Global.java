package com.church.epmc;

public class Global {

    private static Global instance;

    // Global variables
    private String author,date,epistle,gospel,ot,psalms,title,audio;

    // Restrict the constructor from being instantiated
    private Global(){}

    public static synchronized Global getInstance(){
        if(instance==null){
            instance=new Global();
        }
        return instance;
    }

    public void setData(String author,String date,String epistle,String gospel,String ot,String psalms,String title,String audio){
        this.author=author;
        this.date=date;
        this.epistle=epistle;
        this.gospel=gospel;
        this.ot=ot;
        this.psalms=psalms;
        this.title=title;
        this.audio=audio;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getDate(){
        return this.date;
    }

    public String getEpistle(){
        return this.epistle;
    }

    public String getGospel(){
        return this.gospel;
    }

    public String getOt(){
        return this.ot;
    }

    public String getPsalms(){
        return this.psalms;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAudio() {
        return this.audio;
    }

}
