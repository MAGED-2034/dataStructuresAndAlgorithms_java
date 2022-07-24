/*****
 *  Algorithm part_1  princeton university
 *  COURSERA
 *  WEEK 1
 * Assighenment_1's solution
 * RondomWord.java
 *****/


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RondomWord {
    public static void main(String[] args){
        String str = "";

        String champoin = str;
        int i = 0;
        while (!StdIn.isEmpty()){
            i++;
            str = StdIn.readString();
            if(StdRandom.bernoulli((double) 1/i)){
                champoin = str;
            }
        }

        System.out.println(champoin);


    }
}
