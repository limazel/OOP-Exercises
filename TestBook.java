public class TestBook {
    public static void main(String[] args) {
        // Yazarları oluştur
        Author a1 = new Author("Azad", "azad@example.com", 'M');
        Author a2 = new Author("Leyla", "leyla@example.com", 'F');

        // Yazarları diziye koy
        Author[] authors = {a1, a2};

        // Kitap oluştur
        Book book = new Book("Java with Love", authors, 39.99, 10);

        // Kitap bilgilerini yazdır
        System.out.println(book);

        // Yazar isimlerini yazdır
        System.out.println("Authors: " + book.getAuthorNames());

        // Set ve Get işlemleri
        book.setPrice(49.99);
        book.setQty(5);
        System.out.println("Updated Price: " + book.getPrice());
        System.out.println("Updated Quantity: " + book.getQty());
    }
}
