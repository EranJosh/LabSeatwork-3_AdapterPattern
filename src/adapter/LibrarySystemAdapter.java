package adapter;

/**
 * Adapter class for integrating the LibrarySystem into SchoolManagementApp
 */
public class LibrarySystemAdapter implements SchoolManagementApp {
    
    private LibrarySystem librarySystem;
    
    /**
     * Constructor that initializes the adapter with a LibrarySystem instance
     * @param librarySystem The library system to be adapted
     */
    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }
    
    /**
     * Adapts the integrateSystem() method to manageBooks()
     */
    @Override
    public void integrateSystem() {
        System.out.println("Integrating Library System...");
        librarySystem.manageBooks();
    }
}