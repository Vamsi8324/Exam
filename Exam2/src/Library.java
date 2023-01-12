
import java.util.Scanner;

 

public class Library {

 

    public static void main(String[] args) {
        Author author1 =new Author("rupesh", 34, "Male");
        Author author2 =new Author("Raja",32, "Male");
        Author author3 =new Author("Indira", 45, "Female");
        Author author4 =new Author("Raja1", 46, "Male");
        Author author5 =new Author("Vasra", 27, "Male");
        Book[] book =new Book[5];
        book[0] =new Book("c", author1, 100, 500, 101);
        book[1] =new Book("c++", author2, 200, 600, 102);
        book[2] =new Book("Java", author3, 300, 500, 103);
        book[3] =new Book("python", author4, 400, 700, 104);
        book[4] =new Book("kubernetes", author5, 100, 400, 105);
        try {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter book index number to get the details");
        int indexnumber = scanner.nextInt();
        System.out.println("Book detals:"+book[indexnumber]);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

 

    }

 

}