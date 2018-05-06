import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> okok = new ArrayList<>();
            ObjectInputStream entree = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("Simulation_20180505211435.dat")));

            int j=0;

            while(1==1){
                 okok.add((String)entree.readObject());
                 System.out.println(okok.get(j));
                 j++;
            }




        }catch (Exception e){
            System.out.println("ok");
        }
    }
}
