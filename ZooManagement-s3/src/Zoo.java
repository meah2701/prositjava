
public class Zoo {
    Animal [] animal;
    String name;
    String city ;
    int nbrCages;
    public Zoo() {}
    public Zoo(String name, String city, int nbrCages ) {

        this.name = name;
        this.city = city;
        this.animal = new Animal[nbrCages];
        this.nbrCages = nbrCages;

    }
    public void displayZoo(){
        System.out.println("zoo : "+this.name +" city: " +this.city + "nbCages:  "+this.nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo : " + name +"city: "+city+ ", Number of cages: " + nbrCages;
    }

    boolean addAnimal(Animal an){
        for (int i=0;i<animal.length;i++){
            if(animal[i]==null){
            animal[i]=an;
        }}
        return true;
    }
}
