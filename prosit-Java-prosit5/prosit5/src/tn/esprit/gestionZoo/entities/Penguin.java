package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;
    public Penguin() {}
    public Penguin(String family,String name,int age,String habitat,boolean isMammal,float swimmingDepth) {
        super(family,name,age,habitat,isMammal);
        this.swimmingDepth = swimmingDepth;
    }

}
