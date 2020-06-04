public class testBookShop {
    public static void main(String[] args) {
        BookShop myBookShop = new BookShop();
        Book myBook = new Book("Букмен", "Фантастика", 123632 , 124 , "Жизнь в будущем",250,false);
        myBookShop.addSor(myBook);
        myBookShop.addSor(new Book("Роскниг", "Исторический",2145215 , 255, "Меч короля", 300, false));
        Journal myJournal = new Journal("Мир книг","Основана на реальных событиях",125556,25,"Сыщики",100,true);
        myBookShop.addSor(myJournal);
        myBookShop.printBookShop();
        if (myBookShop.findSor(myBook)) {
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
        System.out.println();
        System.out.println("Книжный магазин после удаления первой книги");
        myBookShop.removeSor(myBook);
        myBookShop.printBookShop();
    }
}