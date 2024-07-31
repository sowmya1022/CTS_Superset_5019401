
// MVCPatternTest.java
public class MVCPatternTest {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("John Doe", "12345", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentId("67890");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}