package projetoyoutube;

public class Student extends Person {

    private String login;
    private int totalAssisted;

    public Student(String name, int age, String sex, String login) {
        super(name, age, sex);
        this.login = login;
        this.totalAssisted = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssisted() {
        return totalAssisted;
    }

    public void setTotalAssisted(int totalAssisted) {
        this.totalAssisted = totalAssisted;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "\nlogin='" + login + '\'' +
                ", totalAssisted=" + totalAssisted +
                '}';
    }
}
