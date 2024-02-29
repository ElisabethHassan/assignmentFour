import java.util.LinkedList;
import java.util.Queue;

public class RNA_Protein_Q6 {

    public void rnaToProtein(String rna) {
        String result;
        String protein ="";
        int i;
        Queue<Character> rnaQueue = new LinkedList<>();
        for (char n : rna.toCharArray()) {
            rnaQueue.add(n);
            if (rnaQueue.size() == 3) {
                result = "";
                for (i = 0; i < 3; i++) {
                    result += rnaQueue.remove();
                }
                protein = getProtein(result);
                System.out.print(protein);
            }
        }
        System.out.println();
    }

    private static String getProtein(String rna) {
        switch (rna) {
            case "UUU":
            case "UUC":
                return "F";
            case "UUA":
            case "UUG":
            case "CUU":
            case "CUC":
            case "CUA":
            case "CUG":
                return "L";
            case "AUU":
            case "AUC":
            case "AUA":
                return "I";
            case "AUG":
                return "M";
            case "GUU":
            case "GUC":
            case "GUA":
            case "GUG":
                return "V";
            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG":
            case "AGC":
            case "AGU":
                return "S";
            case "UAU":
            case "UAC":
                return "Y";
            case "UGU":
            case "UGC":
                return "C";
            case "UGG":
                return "W";
            case "CCU":
            case "CCC":
            case "CCA":
            case "CCG":
                return "P";
            case "CAU":
            case "CAC":
                return "H";
            case "CAA":
            case "CAG":
                return "Q";
            case "CGA":
            case "CGG":
            case "CGC":
            case "CGU":
            case "AGG":
            case "AGA":
                return "R";
            case "ACU":
            case "ACC":
            case "ACA":
            case "ACG":
                return "T";
            case "AAC":
            case "AAU":
                return "N";
            case "AAA":
            case "AAG":
                return "K";
            case "GCU":
            case "GCC":
            case "GCA":
            case "GCG":
                return "A";
            case "GGU":
            case "GGC":
            case "GGA":
            case "GGG":
                return "G";
            case "GAU":
            case "GAC":
                return "D";
            case "GAA":
            case "GAG":
                return "E";
            default:
                return ".";
        }
    }

}
