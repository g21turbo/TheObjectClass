public class Main extends Object {

    public static void main(String[] args) {

        Student bob = new Student("Bob", 37);
        System.out.println(bob);

        CollegeStudent jimmy = new CollegeStudent("Jimmy", 21, "Carol");
        System.out.println(jimmy);

    }
}

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
    }
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

class CollegeStudent extends Student {

    private String parentName;

    public CollegeStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s son, " + super.toString();
    }
}