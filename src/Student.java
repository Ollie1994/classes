public class Student {
    private String name;
    private int studentId;
    private double grade;

    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setStudentId(int newStudentId) {
        studentId = newStudentId;
    }
    public int getStudentId() {
        return studentId;
    }

    public void changeGrade(double i) {
        if (i >= 0.0 && i <= 4.0) {
            grade = i;
        System.out.println("New grade: " + grade);
        }
        else {
            System.out.println("out of range (0.0 - 4.0)");
        }
    }
    public double seeGrade() {
        return grade;
    }


}
