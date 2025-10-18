package selfStudy.Constructor;

public class Book {
    private String title;
    private String author;
    private Double Price;


    public String getTitle(){
        return title;
    }
    public String getAuthor(){
    return author;}

    public Double getPrice(){
        return Price;
    }
//   //One constructor takes title and author as parameters.
//    public Book(String title, String author){
//        this.title = title;
//        this.author = author;
//    }
    //The other constructor takes title, author, and price as parameters.
    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.Price = price;
    }

    //write a method setting discount
    public void SetDiscount(double discountPercent){
        if(discountPercent > 0 && discountPercent <= 100){
            Price = Price - (Price * discountPercent / 100);
        }
        else{
            System.out.println("Discount percent: " + discountPercent);
        }
    }

    //method compare book price
    public void ComapreBookPrice(Book otherBook){
      if(this.Price > otherBook.Price){
          System.out.println(this.title + ": " + "More Expensive than" + ": " + otherBook.title);
      }
      else if(this.Price < otherBook.Price){
          System.out.println(this.title + ": " + "Less Expensive than" + ": " + otherBook.title);
      }
      else if(this.Price == otherBook.Price){
          System.out.println(this.title + ": " + "same" + ": " + otherBook.title);
      }
      else{
          System.out.println(this.title + ": " + "IDK" + ": " + otherBook.title);
      }
    }

    public static void main (String[] args){
        //create an original book
        Book book = new Book("Title", "Author", 10.0);
        Book otherBook = new Book("team", "jame", 23.0);
        //print
        System.out.println("The Original Book Title: " + book.getTitle());
       System.out.println("The Original Book Author: " + book.getAuthor());
       System.out.println("The Original Book Price: " + book.getPrice());

       //setting the discount let say applies 20% discount
//        book.SetDiscount(20);
//        System.out.println("After Discount Book price: " + book.getPrice());

        System.out.println("The Original Book Title: " + otherBook.getTitle());
        System.out.println("The Original Book Author: " + otherBook.getAuthor());
        System.out.println("The Original Book Price: " + otherBook.getPrice());

        book.ComapreBookPrice(otherBook);


    }
}
