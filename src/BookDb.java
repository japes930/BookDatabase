//package BookDatabase;

public class BookDb {
    private String sku, title, author, description;
    private double price;

//    public BookDb (){
////        Constructor
//    }

    public BookDb(String sku, String title, String author, String description, double price){
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

//    public String getBySku(String sku){
//        if (this.sku == sku)
//            return title;
//
//    }


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
        this.price = price;
    }

//
//    public void getDisplayText(){
//        System.out.println("Title: " + getTitle()+ '\n' +
//               "Author: " + getAuthor() + '\n' +
//                getDescription() + "\n"+"Price: " + getPrice());
//    }

    public String getDisplayText(){
        return "Title: " + getTitle()+ '\n' +
               "Author: " + getAuthor() + '\n' +
                getDescription() + '\n' + "Price: " + getPrice();
    }




}
