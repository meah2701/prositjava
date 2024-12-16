package tn.esprit.gestionZoo.entities;

public class Dolphin  extends Aquatic{
      private float swimmingSpeed;
      public Dolphin() {}

    public Dolphin(String family, String name, int age, String habitat, boolean isMammal, float swimmingSpeed) {
        super(family, name, age, habitat, isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                "} " + super.toString();
    }
    public void swim()
    {
        System.out.println("Swimming Dolphin");
    }
}

