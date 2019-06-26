public class BookDatabase {
    private String sku, title, author, description;
    private double price;

    public Book(String sku, String title, String author, String description, double price){
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public String getSku(){
        return this.sku;
    }
    public void setSku(){
        this.sku = sku;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(){
        this.author = author;
    }

    public String getDescription(){
        return this.description = description;
    }
    public void setDescription(){
        this.description = description;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(){
        this.price = price
    }


    public void lookupBook(input){
        switch (input){
            case Java1001:
                System.out.println("Title: " + getTitle(book1));
                System.out.println("Author: " + getAuthor(book1));
                System.out.println(getDescription(book1));
                System.out.println("Price: " + getPrice());
                break;
            case Java1002:
                System.out.println("Title: " + getTitle(book2));
                


        }
    }
}
