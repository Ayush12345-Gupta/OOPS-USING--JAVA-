class Student {
    int id;
    String name;
    int age;
    // Default constructor
    Student() {
        id = 0;
        name = "Not Assigned";
        age = 0;
    }
    // Parameterized constructor
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Age  : " + age);
        System.out.println();
    }
    public static void main(String[] args) {

        Student s1 = new Student(101, "Ayush", 20);
        System.out.println("Student 1 Details:");
        s1.display();
    }
}
