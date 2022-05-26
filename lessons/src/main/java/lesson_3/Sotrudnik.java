package lesson_3;

public class Sotrudnik {
    private String name;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Sotrudnik(String name, String position, String email, String tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("ФИО " + name);
        System.out.println("должность " + position);
        System.out.println("email " + email);
        System.out.println("телефон " + tel);
        System.out.println("зарплата " + salary);
        System.out.println("возраст " + age);
    }

    public int getAge() {
        return age;
    }
}
