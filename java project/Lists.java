import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        
        ArrayList<Integer> skaiciai = new ArrayList<Integer>();

        skaiciai.add(4);
        skaiciai.add(5);
        skaiciai.add(6);
        skaiciai.add(7);
        skaiciai.add(2, 8);
        System.err.println(skaiciai.size());
        Integer penketukas = skaiciai.get(1); // Objekto numeriukas

        skaiciai.remove(penketukas);
        skaiciai.remove(1);

        System.err.println(skaiciai);

    }
}
