package tn.esprit.gestionZoo.entities;

public class Zoo
{
    private String name;
     private String city;
    private  static final int nbr_cages=25;
    private Animal[] animals;
    private int nbr_animals;
    public Zoo(){}

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbr_cages=" + nbr_cages +
                '}';
    }
    public Zoo(String name, String city,int nbr_cages)
    {
        this.name = name;
        this.city = city;
        animals = new Animal [nbr_cages];
    }
    public String getName()
    {
        return name;
    }
    public String getCity()
        {
            return city;
        }
        public int getNbr_cages()
        {
            return nbr_cages;
        }

    public Animal[] getAnimals() {
        return animals;
    }
    public int getNbr_animals()
    {
        return nbr_animals;
    }
    public void setNbr_animals(int nbr_animals)
    {
        this.nbr_animals = nbr_animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public void setName (String name)
    {
        if(name.isEmpty())
            System.out.println("Name cannot be empty");
        else
        this.name = name;
    }
    public void setCity(String city)
    {
        this.city = city;
    }


    public void DisplayZoo()
    {
        System.out.println("ZooName :"+name);
        System.out.println("ZooCity :"+city);
        System.out.println("ZooNbrCages :"+nbr_cages);
        for (Animal animal : animals)
        {
            System.out.println(animal);
        }
    }
    public void DisplayAnimals()
    {
        System.out.println(" list of Animals :");
        for(int i=0;i<animals.length;i++)
        {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal)
    {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i]!=null && animal.getName()==animals[i].getName() )  {
                    return i;
                }
            }
        return -1;
    }
    public boolean addAnimal(Animal animal)
    {
        if(searchAnimal(animal)==-1) {
            if(!isZooFull())
            {
            for (int i = 0; i < animals.length; i++) {
                 if (animals[i] == null) {
                    animals[i] = animal;
                    nbr_animals++;
                    return true;
                }
               }
            }
            return false;
        }
        else
            System.out.println("animal existant");
        return false;
    }
    public boolean removeAnimal(Animal animal) {
        int recherche = searchAnimal(animal);
        if (recherche == -1)
            return false;
        for (int i = 0; i < nbr_animals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbr_animals] = null;
        nbr_animals--;
        return true;
    }
    public boolean isZooFull()
    {
        return nbr_animals == nbr_cages;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if(z1.nbr_animals>z2.nbr_animals)
            return z1;
        return z2;
    }


}
