// Person 类，表示人的基本特征和行为
class Person {
    private String name;
    private String gender;
    private int age;
    private double height;

    public Person(String name, String gender, int age, double height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void entertain() {
        System.out.println(name + " is entertaining.");
    }

    public void shopping() {
        System.out.println(name + " is shopping.");
    }
}

// Teacher 类，表示老师，继承自 Person 类，包含老师特有的属性和行为
class Teacher extends Person {
    private int employeeID;
    private String title;
    private String major;
    private double salary;

    public Teacher(String name, String gender, int age, double height, int employeeID, String title, String major, double salary) {
        super(name, gender, age, height);
        this.employeeID = employeeID;
        this.title = title;
        this.major = major;
        this.salary = salary;
    }

    public void teach(Student student) {
        System.out.println(getName() + " is teaching " + student.getName());
    }

    public void gradeStudentWork(Student student) {
        System.out.println(getName() + " is grading " + student.getName() + "'s work.");
    }
}

// Student 类，表示学生，继承自 Person 类，包含学生特有的属性和行为
class Student extends Person {
    private int studentID;
    private int grade;
    private String major;
    private double gradePoint;

    public Student(String name, String gender, int age, double height, int studentID, int grade, String major, double gradePoint) {
        super(name, gender, age, height);
        this.studentID = studentID;
        this.grade = grade;
        this.major = major;
        this.gradePoint = gradePoint;
    }

    public void study() {
        System.out.println(getName() + " is studying.");
    }

    public void doHomework() {
        System.out.println(getName() + " is doing homework.");
    }
}

// 测试类
