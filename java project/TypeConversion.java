import java.math.BigDecimal;
import java.math.RoundingMode;
public class TypeConversion {
    
    public static void main(String[] args) {
        long nesveikaiDidelisSkaicius = 65465454;
        int sveikasSkaicius = 4;//-2 147 483 648 iki 2 147 483 647  
        short mazesnisSveikasSkaicius = 88;// -32 768 iki 32 767
        byte labaiMazasSveikasSkaicius = 100; // nuo -128 iki 127

        // Type casting #Exception at runtime
        sveikasSkaicius = (int)nesveikaiDidelisSkaicius;

        float nesveikasSkaiciusNetikslus = 4.999f; 

        sveikasSkaicius = (int)nesveikasSkaiciusNetikslus; // 4


        double nesveikasSkaiciusTikslus = 4.4;




        char charcter = 'a';// Būtinos viengubos kabutės
        sveikasSkaicius = (int)charcter;
        System.out.println(sveikasSkaicius); //ASCII raidės kodas

        boolean arTuriVaiku = false;


        charcter = (char)65;
        String tekstas = "" + charcter;
        System.err.println(tekstas);
        
        float a = 0.6f, b = 3;
        double c = 0.6f, d = 3;

        double atsakymas = c * d;
        System.err.println(atsakymas);

        atsakymas = round(2.20222222, (byte)2);
        System.err.println(atsakymas);

        
    }

    public static double round(double sk, byte tikslumas){
        return new BigDecimal(sk).setScale(tikslumas, RoundingMode.HALF_UP).doubleValue();
    }
}



