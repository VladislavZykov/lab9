public class Book extends PrintMedia {
    private String nameBook;
    private int numKol;
    private Boolean have;
    public Book() {
        super();
        nameBook = "noname";
        numKol = 2;
        have = false;
    }
    public Book(String name, String w, int l, int h, String nameK, int n, Boolean f) {
        super(name, w, l, h);
        this.nameBook =  nameK;
        this.numKol = n;
        this.have = f;
    }
    public void setNameKomand(String name) {
        this.nameBook = name;
    }
    public String getNameKomand() {
        return nameBook;
    }
    public void setNumPoint(int n) {
        numKol = n;
    }
    public int getNumPoint() {
        return numKol;
    }
    public void setWon(Boolean b) {
        this.have = b;
    }
    public Boolean isFullTime() {
        return have;
    }
    public String toString() {
        return getVidSorevnov() + " " + getRun() + " " + getJumping() +" "+ getSwimming() +" " + nameBook + " " + numKol + " " + have;
    }
}