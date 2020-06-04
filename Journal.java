import java.util.Scanner;
public class Journal extends PrintMedia{
    private String nameJournal;
    private int numKol2;
    private Boolean have2;

    public Journal(){
        super();
        nameJournal = "";
        numKol2 = 4;
        have2 = false;//проигрыш
    }
    public Journal(String name, String w, int l, int h, String nameP, int n, Boolean f){
        super(name,w,l,h);
        nameJournal = nameP;
        numKol2 = n;
        have2 = f;
    }
    public void setNamePer(String name){
        nameJournal = name;
    }
    public String getNamePer(){
        return nameJournal;
    }
    public void setNumParticipants(int n){
        numKol2 = n;
    }
    public int getNumParticipants(){
        return numKol2;
    }
    public void setWoon(Boolean b){
        have2 = b;
    }
    public Boolean isWoon(){
        return have2;
    }
    public void setAllInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите печатное издание: ");
        String nazv=in.next();
        setVidSorevnov(nazv);
        System.out.print("Введите дистанцию бега: ");
        String w=in.next();
        setRun(w);
        System.out.print("Введите номер выпуска: ");
        int l = in.nextInt();
        setJumping(l);
        System.out.print("Введите страницы: ");
        int h = in.nextInt();
        setSwimming(h);
        System.out.print("Введите наименование:");
        nameJournal = in.next();
        System.out.print("Введите кол-во: ");
        numKol2 = in.nextInt();
        System.out.print("Введите выиграл или нет (true/false): ");
        have2 = in.nextBoolean();
        System.out.println();//пустая строка
    }
    public String toString(){
        return "\n\t"+"Журнал"+"\n\t"+"Печатное издание журнала: "+getVidSorevnov()+"\n\t"+"Жанр: "
                +getRun()+ "\n\t"+"Номер выпуска: "+getJumping()+"\n\t"+"Страницы: "+getSwimming()+"\n\t"+"Наименование журнала: "+nameJournal+"\n\t"+"Кол-во: "+numKol2+"\n\t"+"Присутствует: "
                +have2+"\n";
    }
}