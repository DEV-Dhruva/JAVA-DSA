public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "red";
        p1.tip = 3;
        System.out.println(p1.color + " " + p1.tip);

        BankAcc myAcc = new BankAcc();
        myAcc.userName = "Tony";
        myAcc.setPwd("Tony@123");

        Newpen p2 = new Newpen();
        p2.setColor("Blue");
        p2.setTip(7);
        System.out.println(p2.getColor() + " " + p2.getTip());

        Student s1 = new Student("Rony");
        s1.marks[0] = 80;
        s1.marks[1] = 100;
        System.out.println(s1.marks[0] + " " + s1.marks[1]);

        // Student s2 = new Student(s1); // s2 will copy the prop of s1 using copy constructor
        // System.out.println(s2.marks[0] + " " + s2.marks[1]);
        // s1.marks[1] = 50; // data is changed in s1
        // System.out.println(s2.marks[0] + " " + s2.marks[1]); // it also get changed in s2 as
                                                             // the arrays marks having
                                                             // same reference for s1 and s2

        Student s3 = new Student(s1); // s3 will copy the prop of s1 using copy constructor
        System.out.println(s3.marks[0] + " " + s3.marks[1]);
        s1.marks[1] = 50; // data is changed in s1
        System.out.println(s3.marks[0] + " " + s3.marks[1]); // here it will make another array
                                                             // for s3, so the changed in array
                                                             //s1.marks[1] above will not relect in s3
    }
}

class BankAcc {
    public String userName;
    private String Password;

    public void setPwd(String pwd) {
        Password = pwd;
    }

    public void getPwd() {
        System.out.println(this.Password);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Newpen {
    private String color;
    private int tip;

    String getColor() { // setters
        return this.color;
    }

    int getTip() { // setters
        return this.tip;
    }

    void setColor(String newColor) { // getters
        color = newColor;
    }

    void setTip(int newTip) { // getters
        tip = newTip;
    }
}

class Student {
    String name;
    int marks[];

    Student(String newName) { // constructor called here,
                              // and in above classes there is default constructor called by java
        System.out.println("constructor is called");
        this.name = newName;
        System.out.println(this.name);
        marks = new int[2];

    }

    // Student(Student s1) { // copy constructor(also called as shallow copy)
    // this.name = s1.name;
    // marks = new int[2];
    // this.marks = s1.marks;
    // }

    Student(Student s1) { // copy constructor(also called as Deep copy)
        this.name = s1.name;
        marks = new int[2];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}