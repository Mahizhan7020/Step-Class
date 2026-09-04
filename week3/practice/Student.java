class Student1 {
    String name;
    int marks;
}

public class Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Divya";
        s.marks = 88;
        System.out.println("Name: " + s.name + " | Marks: " + s.marks);
    }
}
