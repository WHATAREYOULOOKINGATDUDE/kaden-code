import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//https://cccgrader.com/getproblem.php?fid=220944&authcode=fa89fd8de8b4d71b9aa2f016c6f40048

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, String> dictionary = new HashMap<>();
        dictionary.put('a', "a");
        dictionary.put('b', "bac");
        dictionary.put('c', "cad");
        dictionary.put('d', "def");
        dictionary.put('e', "e");
        dictionary.put('f', "feg");
        dictionary.put('g', "geh");
        dictionary.put('h', "hij");
        dictionary.put('i', "i");
        dictionary.put('j', "jik");
        dictionary.put('k', "kil");
        dictionary.put('l', "lim");
        dictionary.put('m', "mon");
        dictionary.put('n', "nop");
        dictionary.put('o', "o");
        dictionary.put('p', "poq");
        dictionary.put('q', "qor");
        dictionary.put('r', "ros");
        dictionary.put('s', "sut");
        dictionary.put('t', "tuv");
        dictionary.put('u', "u");
        dictionary.put('v', "vuw");
        dictionary.put('w', "wux");
        dictionary.put('x', "xuy");
        dictionary.put('y', "yuz");
        dictionary.put('z', "zuz");
        char[] input = sc.next().toCharArray();
        String output = "";
        for (int i = 0; i < input.length; i++){
            char key = input[i];
            output += dictionary.get(key);
        }
        System.out.println(output);
    }
}