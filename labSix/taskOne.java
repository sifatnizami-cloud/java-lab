class Person {
void showPerson() {
System.out.println("I am a Person.");
}
}

class Doctor extends Person {
void showDoctor() {
System.out.println("I am a Doctor.");
}
}

class Teacher extends Person {
void showTeacher() {
System.out.println("I am a Teacher.");
}
}

class Engineer extends Person {
void showEngineer() {
System.out.println("I am an Engineer.");
}
}

public class Hierarchical {
public static void main(String[] args) {
Doctor doctor = new Doctor();
Teacher teacher = new Teacher();
Engineer engineer = new Engineer();
doctor.showPerson();
doctor.showDoctor();
teacher.showPerson();
teacher.showTeacher();
engineer.showPerson();
engineer.showEngineer();
}
}
