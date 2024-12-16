package tn.esprit.gestionZoo.entities;

public class Animal {
   private String name;
     private String family;
    private int age;
  private boolean isMammal;
    public Animal() {}
    public Animal(String name, String family, int age, boolean isMammal) {
           this.name=name;
           this.family=family;
           this.age=age;
           this.isMammal=isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setAge(int age) {
        if(age<0)
            System.out.println("Invalid Age");
        else
        this.age = age;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
