package adapter;

/**
 * Adapter class for integrating the AttendanceSystem into SchoolManagementApp
 */
public class AttendanceSystemAdapter implements SchoolManagementApp {
    
    private AttendanceSystem attendanceSystem;
    
    /**
     * Constructor that initializes the adapter with an AttendanceSystem instance
     * @param attendanceSystem The attendance system to be adapted
     */
    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }
    
    /**
     * Adapts the integrateSystem() method to markAttendance()
     */
    @Override
    public void integrateSystem() {
        System.out.println("Integrating Attendance System...");
        attendanceSystem.markAttendance();
    }
}