package org.example;


import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random randomNum = new Random();
        int showMe = randomNum.nextInt(10);

        String[] impositionWeek = new String[10];
        impositionWeek[0] = "Just Loli";
        impositionWeek[1] = "Just Husbando";
        impositionWeek[2] = "Just Waifu";
        impositionWeek[3] = "Just Healers";
        impositionWeek[4] = "Just Shilds";
        impositionWeek[5] = "Just 1 Region";
        impositionWeek[6] = "Just 1 Element";
        impositionWeek[7] = "Just 1 Weapon";
        impositionWeek[8] = "Just Husbandini";
        impositionWeek[9] = "Just Waifunine";


        String[] boosWeek = new String[6];
        boosWeek[0] = "Wolf";
        boosWeek[1] = "Tarty";
        boosWeek[2] = "Signora";
        boosWeek[3] = "Raiden";
        boosWeek[4] = "Pinocchio";
        boosWeek[5] = "Drago Dendro";

        int showMeBoss = randomNum.nextInt(5);
        System.out.println("The random boss is: " + boosWeek[showMeBoss] + "\n");
        TimeUnit.SECONDS.sleep(2);

        String pick = impositionWeek[showMe];
        System.out.println("The constraint for this weak boss battle is: ");
        TimeUnit.SECONDS.sleep(2);

        if (pick.equals(impositionWeek[0])) {
            System.out.println(pick);

        } else if (pick.equals(impositionWeek[1])) {
            System.out.println(pick);

        } else if (pick.equals(impositionWeek[2])) {
            System.out.println(pick);

        } else if (pick.equals(impositionWeek[3])) {
            System.out.println(pick);

        } else if (pick.equals(impositionWeek[4])) {
            System.out.println(pick);

        } else if (pick.equals(impositionWeek[5])) {
            int showMe2 = randomNum.nextInt(4);
            String[] regions = new String[4];
            regions[0] = "Mondstadt";
            regions[1] = "Liyue";
            regions[2] = "Inazuma";
            regions[3] = "Sumeru";

            System.out.println(pick + "\nThe region is:");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(regions[showMe2]);

        } else if (pick.equals(impositionWeek[6])) {
            int showMe3 = randomNum.nextInt(7);
            String[] elements = new String[7];
            elements[0] = "Anemo";
            elements[1] = "Geo";
            elements[2] = "Electro";
            elements[3] = "Dendro";
            elements[4] = "Hydro";
            elements[5] = "Pyro";
            elements[6] = "Cryo";

            System.out.println(pick + "\nThe element is:");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(elements[showMe3]);

        } else if (pick.equals(impositionWeek[7])) {
            int showMe4 = randomNum.nextInt(5);
            String[] weapons = new String[5];
            weapons[0] = "Bow";
            weapons[1] = "Polearm";
            weapons[2] = "Sword";
            weapons[3] = "Catalyst";
            weapons[4] = "Claymore";

            System.out.println(pick + "\nThe weapon is:");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(weapons[showMe4]);

        } else if (pick.equals(impositionWeek[8])) {
            System.out.println(pick);


        } else if (pick.equals(impositionWeek[9])) {
            System.out.println(pick);


            System.out.println("\nGood Luck!!! ;) ");

        }
    }
}