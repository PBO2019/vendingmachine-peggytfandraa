
package kopi;
import java.util.ArrayList;
import java.util.Scanner;

public class Kopi {

   
    
    public static void main(String[] args) {
ArrayList<String> kopi   = new ArrayList<String>();

        mesinKopi robusta = new mesinKopi();
        robusta.setjenisKopi("Robusta");
        robusta.setjumlahstockKopi(40);
        robusta.settopping("Gula");
        kopi.add(robusta.getjenisKopi());
        topping.add(robusta.getkopi());
        
        mesinKopi arabica = new mesinKopi();
        arabica.setjenisKopi("Arabica");
        arabica.setjumlahstockKopi(40);
        arabica.settopping("Susu");
        kopi.add(robusta.getjenisKopi());
        topping.add(arabica.gettopping());

	for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;
    }
}
