package library;

/**
 * @author Ankit
 * @version 2.1
 * @since 2024
 */
public class Book {

    /**
     * Required details
     */
    private String name;
    private String desc;
    private int studentId;
    private int bookId;

    /**
     * Parameterized Constructor for Book details
     * @param name denotes book name
     * @param desc denotes book description
     * @param bookId denotes Book Id
     */
    public Book(String name, String desc, int bookId) {}


    /**
     * Method for Registration of new Book
     * @param bookId denotes book ID
     * @param studentId denotes Student RollNo
     */
    public void register(int bookId,int studentId){}


    /**
     * Method for returning Book
     * @param bookId denotes Book ID
     * @return returns a confirmation ID
     * @throws Exception throws exception on Any Damage
     */
    public int returnBook(int bookId) throws Exception{
        return bookId;
    }
}
