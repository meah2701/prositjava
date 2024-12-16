

import java.util.Scanner;

/**
 *
 * @author houss
 * @author houss
 */
public class ZooManagement {



    public static void main(String[] args) {
        int nbrCages;
        String zooName;
        Scanner x=new Scanner(System.in);
        do{
            System.out.println("donner nbrCages");
            nbrCages=x.nextInt() ;}
        while (nbrCages<0);
        do{
            Scanner y=new Scanner(System.in);
            System.out.println("donner zooName");
            zooName=y.nextLine() ;
        }while(!zooName.matches("^[a-zA-Z]*$"));
        System.out.println(zooName+" comporte "+ nbrCages+" cages");

    }
}
