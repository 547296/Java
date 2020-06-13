package first;

import java.util.Objects;

public class Persoana {

     final Integer wage = 100;
    String name;
    String job;
    int age;
    String ageTo = "5";

    public Persoana(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return age == persoana.age &&
                Objects.equals(wage, persoana.wage) &&
                Objects.equals(name, persoana.name) &&
                Objects.equals(job, persoana.job) &&
                Objects.equals(ageTo, persoana.ageTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wage, name, job, age, ageTo);
    }

    public Persoana(Integer wage) {
    }

    public static void main(String[] args) {
        Persoana persoana = new Persoana(30, "Anna", "QA");
        Persoana persoana2 = new Persoana(30,"Anna","QA");
        persoana.wage.equals(100);

        if(persoana==persoana2){
            System.out.println("TRUE");
        }

        if(persoana.equals(persoana2)){
            System.out.println("true");
        }
        System.out.println(persoana.hashCode());
        System.out.println(persoana2.hashCode());
        try {

        }catch (Exception e){

        }finally {
            System.out.println("Hello");
        }


    }

    @Override
    public String toString() {
        return "Persoana{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
