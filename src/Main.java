
import java.util.ArrayList;
import java.util.Scanner;
//import BookDb; BookDb is in the default package

public class Main{

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String input;
        ArrayList<BookDb> Books = new ArrayList<BookDb>();

        BookDb book1 = new BookDb("Java1001", "Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook", 47.50);
        BookDb book2 = new BookDb("Java1002", "Thinking in Java", "Bruce Eckel", " Details about Java under the hood", 20.00);
        BookDb book3 = new BookDb("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky","Everything you need to know in one place", 45.00);
        BookDb book4 = new BookDb("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", " Fun with Python", 10.50);
        BookDb book5 = new BookDb("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Rasperry Pi", 16.50);
        BookDb book6 = new BookDb("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Rasberry Pi!", 14.75);

//        Adding objects to arrayList
        Books.add(book1);
        Books.add(book2);
        Books.add(book3);
        Books.add(book4);
        Books.add(book5);
        Books.add(book6);

        System.out.println("Please enter the SKU of the book you want to look up: ");
        input = keyboard.nextLine();

        switch(input) {
            case "Java1001":
                System.out.println(Books.get(0).lookupBook());
                break;
            case "Java1002":
                System.out.println(Books.get(1).lookupBook());
                break;
            case "Orcl1003":
                System.out.println(Books.get(2).lookupBook());
                break;
            case "Python1004":
                System.out.println(Books.get(3).lookupBook());
                break;
            case "Zombie1005":
                System.out.println(Books.get(4).lookupBook());
                break;
            case "Rasp1006":
                System.out.println(Books.get(5).lookupBook());
                break;
        }


    }
}
