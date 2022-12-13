
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class Vanslyke {

    public Vanslyke() {

    }

    public void begin() { // it going to get a radom int 
        Random ranNum = new Random();

        // sets the random int to a var
        int r = ranNum.nextInt(1000);

        System.out.println("Input yor name: ");
        String userName = Itse2417Main.myScan.nextInt();

        if (r <= 1000) {
            System.out.println(userName + " your going to have a Great Day ");
        } else if (r <= 500) {
            System.out.println(userName + " your going to have a good day ");
        } else if (r <= 100) {
            System.out.println(userName + " your going to have a normal day ");
        } else if (r <= 50) {
            System.out.println( userName + " your going to have a bad day ");
        } else if (r <= 10) {
            System.out.println(userName + " your going to have a verybad day ");
        }

    }

}
