public class Student {
    private String studentMajor;
    private String firstName;
    private String lastName;
    private int studentCredits;
    private int studentPoints;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentMajor = "General Studies";
        this.studentCredits = 0;
        this.studentPoints = 0;
    }

    public Student(String studentMajor, String firstName, String lastName, int studentCredits, int studentPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentMajor = studentMajor;
        this.studentCredits = studentCredits;
        this.studentPoints = studentPoints;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public int getStudentCredits() {
        return studentCredits;
    }

    public int getStudentPoints() {
        return studentPoints;
    }

    public String getFullName() {
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    public void setMajor(String major) {
        this.studentMajor = major;
    }

    public void loopHelper(int startVal, int endVal, int incVal) {
        int sum = 0;
        String numString = "";
        for(int i = startVal; i <= endVal;) {
            System.out.printf("%d ", i);
            sum = sum + i;
            i = i + incVal;
        }
        System.out.println();
        System.out.printf("The sum is %d", sum);
    }

    public void printInfo() {
        System.out.printf("Name: %s\n", this.getFullName());
        System.out.printf("Major: %s\n", this.getStudentMajor());
        System.out.printf("Grade Points: %d\n", this.getStudentPoints());
        System.out.printf("Credits: %d\n", this.getStudentCredits());
    }
}
