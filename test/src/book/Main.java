package book;

public class Main {
    public static void main(String[] args) {
        // ประกาศตัวแปร array มาเก็บ Object
        Object[] book = {new Book(1, "ภาษา Java", 290),
                new Book(2, "ภาษา SQL", 250),
                new Book(3, "ภาษา JSP", 260)};

        // ใช้งานคำสั่ง for loop
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }
}
