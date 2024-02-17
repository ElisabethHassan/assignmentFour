import java.util.LinkedList;
import java.util.Queue;

public class DNA_Q5 {

    /*
    thought process
    iterate through the strings

     */


    Queue<Character> q = new LinkedList<>();

    public String transcription(String dna){
        String rna = "";

        for(char c: dna.toCharArray()){
            if(c == 'T'){
                c = 'U';
            }

            rna += c;
        }

        return rna;
    }

}
