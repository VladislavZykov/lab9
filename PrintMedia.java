public class PrintMedia {
    private String Vid;
    private String genre;
    private int number;
    private int page;

    public void setVidSorevnov(String name){
        Vid = name;
    }
    public void setRun(String w){
        genre = w;
    }
    public void setJumping(int l){
        number = l;
    }
    public void setSwimming(int h){
        page = h;
    }
    public String getVidSorevnov(){
        return Vid;
    }
    public String getRun() {
        return genre;
    }
    public int getJumping() {
        return number;
    }
    public int getSwimming(){
        return page;
    }
    public PrintMedia(){
        Vid = "Без названия";
        genre = "Без названия";
        number = 0;
        page = 0;
    }
    public PrintMedia(String name, String w, int l, int h ){
        Vid = name;
        genre = w;
        number = l;
        page = h;
    }
}