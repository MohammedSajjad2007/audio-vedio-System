class medialtem {
    private String title;
    private String duration;

    medialtem(String t  , String d){
        this.title = t;
        this.duration = d;
    }
    public String getTitle(){
        return title;
    }
    public String getDuration(){
        return duration;
    }
    public void play(){
        System.out.println("Playing Media: " + title);
        System.out.println("Duration: " + duration);
    }
}
class audio extends medialtem{
    private String formet;


    audio(String t, String b , String f ){
        super(t,b);
        this.formet = f;

    }
    public String getFormet(){
        return formet;
    }


    @Override
    public void play(){
        System.out.println("Playing Audio: " + getTitle());
        System.out.println("Duration: " + getDuration());
    }
}
class vedio extends medialtem{

    private String resolution;

    vedio(String t , String d, String r){
        super(t,d);
        this.resolution = r;
    }
    public String getResolution(){
        return resolution;
    }

    @Override
    public void play(){
        System.out.println("Playing Vedio: " + getTitle());
        System.out.println("Resolution: " + getResolution());
    }
}
class maindrive{
    public static void main(String args[]){
        vedio vd = new vedio("Fire" , "5.38 munites" , "128KB");
        audio ad = new audio("Fire" , "5.38 munites" , "MP3"   );

        vd.play();
        ad.play();
    }
}
