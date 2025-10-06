package adapter;

/**
 * Demo class to demonstrate the Adapter pattern implementation
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== School Management Application ===\n");
        
        // Create instances of the different systems (Adaptees)
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();
        
        // Create adapters for each system
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);
        
        // Integrate all systems through the unified interface
        System.out.println("--- System Integration Process ---\n");
        
        attendanceAdapter.integrateSystem();
        System.out.println();
        
        gradingAdapter.integrateSystem();
        System.out.println();
        
        libraryAdapter.integrateSystem();
        System.out.println();
        
        System.out.println("=== All Systems Integrated Successfully ===");
    }
}