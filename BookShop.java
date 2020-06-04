import java.util.ArrayList;
public class BookShop {
    private ArrayList<PrintMedia> masPrint = new ArrayList<PrintMedia>();
    public void addSor(PrintMedia m){
        masPrint.add(m);
    }
    public void removeSor(PrintMedia m){
        masPrint.remove(m);
    }
    public BookShop(){
    }
    public Boolean findSor(PrintMedia m){ //для выяснения – есть ли мебель m в комнате
        return masPrint.contains(m);
    }
    public BookShop(ArrayList< PrintMedia> n){
        masPrint=n;
    }
    public void printBookShop() {
        System.out.println("В книжном магазине: ");
        for (PrintMedia a:masPrint){
            System.out.println("\t"+a.toString());
            if (a instanceof Book) {
                System.out.println("    Это книга");
                System.out.println();
            }
            if (a instanceof Journal) {
                System.out.println("    Это журнал");
                System.out.println();
            }
        }
    }
}