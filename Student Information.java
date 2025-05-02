public class Student {
    private String name;
    private int age;
    private String program;
    private int yearLevel;
    private String course;

    public Student(String name, int age, String program, int yearLevel, String course){
        this.name = name;
        this.age = age;
        this.program = program;
        this.yearLevel = yearLevel;
        this.course = course;
    }

    public void displayStudentInfo(){
        System.out.println("Student Information: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student = new Student("Magsino, Jayma B", 20, "Bachelor of Science in Information Technology", 2, "Object-Oriented Programming");
        student.displayStudentInfo();
    }
}
