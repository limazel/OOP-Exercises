public class TestAuthor {
    public static void main(String[] args) {
        Author azad = new Author("Azad", "azad@azad.com", 'M');
        System.out.println(azad);
        azad.setEmail("azad50@azad.com");
        System.out.println("name is: " + azad.getName());    
        System.out.println("email is: " + azad.getEmail());  
        System.out.println("gender is: " + azad.getGender());


        // Create a new Author object

        Book dummyBook = new Book("Java for dummy", azad, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java", 
            new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
        System.out.println(anotherBook.getAuthorName());  // 
        }

}
