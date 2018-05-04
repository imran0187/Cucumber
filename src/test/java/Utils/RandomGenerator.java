package Utils;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by imranhossan on 12/2/17.
 */
public class RandomGenerator {

    public static void randomNumber() {
        int uniqueNum = 0;
        Random rand = new Random();
        HashSet<Integer> set = new HashSet<Integer>();
        while (set.size() < 1) {
            int randomNum = rand.nextInt(99) + 10;
            set.add(randomNum);
        }
        for (int randNumbers : set) {
            //String to = Integer.toString(randNumbers);
            System.out.println(randNumbers);

        }

    }


    public static double getRandomNumber() {
        double x = Math.random();
        return x;
    }


    public int generateRandomIntIntRange() {
        int min = 10;
        int max = 100;
        Random r = new Random();
        int randomInteger = r.nextInt((max - min) + 1) + min;
        System.out.println("Genarated Random Integer is ==========>>>>>> " + randomInteger);
        return randomInteger;
    }


}
