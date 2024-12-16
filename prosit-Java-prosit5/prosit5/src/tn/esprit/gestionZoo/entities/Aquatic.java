package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal {
    private String habitat;
    public Aquatic() {}
    public Aquatic(String family,String name,int age,String habitat,boolean isMammal) {
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
    public void swim()
    {
        System.out.println("This aquatic animal is swimming");
    }
}

