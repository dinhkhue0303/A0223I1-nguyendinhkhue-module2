class Student {
    private String name = "john";
    private String classes = "C02";

    Student() {
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void setClasses(String classes) {
        this.classes = classes;
        System.out.println(this.classes);
    }
}

public class Test_student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("kk");
        s.setClasses("B");
    }
}
