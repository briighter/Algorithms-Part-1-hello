/* *****************************************************************************
 *  Name:              Jason Lima
 *  Coursera User ID:  e89e9f14dc47e454f8f4a0125b398e3f
 *  Last modified:     November 22, 2022
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

/* *****************************************************************************
 * Write a program RandomWord.java that reads a sequence of words from standard input and prints one of those words uniformly at random.
 * Do not store the words in an array or list. Instead, use Knuth’s method: when reading the ith word, select it with probability 1/i to be the champion,
 * replacing the previous champion. After reading all of the words, print the surviving champion.
 * ***************************************************************************** */
public class RandomWord {
    public static void main(String[] args) {
        while (StdIn.isEmpty() != true) {
            StdIn.readString();
            // if (StdIn.isEmpty() == false) {
            //     StdOut.println();
            // }
        }
    }
}
