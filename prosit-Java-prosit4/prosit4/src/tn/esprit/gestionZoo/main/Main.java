package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Animal;
import tn.esprit.gestionZoo.entities.Zoo;
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("l1","lion",6,true);
        Animal a2 = new Animal("l3","elephant",3,true);
        Animal a1 = new Animal("z1","zebre",2,true);
        Zoo z= new Zoo("my zoo","zz",25);
        Zoo z2= new Zoo("z2","z11",25);
        Zoo z3= new Zoo("zz2","z11",25);
        z.DisplayZoo();
        System.out.println(z);
        System.out.println(z.toString());

        System.out.println(a);
        System.out.println(a.toString());
        //////////////////////
        System.out.println(z.addAnimal(a));
        System.out.println(z.addAnimal(a1));
        System.out.println(z.addAnimal(a2));
        System.out.println(z2.addAnimal(a));
        System.out.println(z2.addAnimal(a1));
        z.DisplayAnimals();

        System.out.println(z.searchAnimal(a2));
        System.out.println("remove animal from zoos");
        System.out.println(z.removeAnimal(a));
        System.out.println(z.comparerZoo(z3,z2));

    }

}