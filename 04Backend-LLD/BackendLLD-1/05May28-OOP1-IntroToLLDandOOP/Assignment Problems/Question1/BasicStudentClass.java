public class BasicStudentClass {
    int age;
    String name;

    void display(){
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
    void sayHello(String name){
        System.out.println(this.name + " says Hello to " + name);
    }
}