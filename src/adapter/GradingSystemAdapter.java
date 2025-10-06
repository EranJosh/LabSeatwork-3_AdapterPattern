package adapter;

/**
 * Adapter class for integrating the GradingSystem into SchoolManagementApp
 */
public class GradingSystemAdapter implements SchoolManagementApp {
    
    private GradingSystem gradingSystem;
    
    /**
     * Constructor that initializes the adapter with a GradingSystem instance
     * @param gradingSystem The grading system to be adapted
     */
    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }
    
    /**
     * Adapts the integrateSystem() method to recordGrades()
     */
    @Override
    public void integrateSystem() {
        System.out.println("Integrating Grading System...");
        gradingSystem.recordGrades();
    }
}