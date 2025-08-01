public class DemoMain{
    public static void main(String[] args){
        // primitive data types:
        long nesveikaiDidelisSkaicius = 65465454;
        int sveikasSkaicius = 4;//-2 147 483 648 iki 2 147 483 647  
        short mazesnisSveikasSkaicius = 88;// -32 768 iki 32 767
        byte labaiMazasSveikasSkaicius = 100; // nuo -128 iki 127
        float nesveikasSkaiciusNetikslus = 4.4f; 
        double nesveikasSkaiciusTikslus = 4.4;
        char charcter = 'a';// Būtinos viengubos kabutės
        boolean arTuriVaiku = false;

        sveikasSkaicius++;
        sveikasSkaicius--;
        int naujasSk = sveikasSkaicius * 5;
        System.out.println(naujasSk);

        System.out.println(nesveikaiDidelisSkaicius);
        System.out.println(sveikasSkaicius);
        System.out.println(mazesnisSveikasSkaicius);
        System.out.println(labaiMazasSveikasSkaicius);
        System.out.println(nesveikasSkaiciusNetikslus);
        System.out.println(nesveikasSkaiciusTikslus);
        System.out.println(charcter);
        System.out.println(arTuriVaiku);

        // complex data types:

        String tekstas = "Hello world!";
        byte[] pazymiai = { 10, 8, 6, 2, 7 };



        int tekstoIlgis = tekstas.length();
        
        System.out.println(tekstoIlgis);
        System.out.println("Hello world!");

        for(int i = 0; i < pazymiai.length; i++){
            byte pazymys = pazymiai[i];
            System.out.print(pazymys);
            if(i == pazymiai.length - 1)
            {
                System.out.print("\n");
            }
            else{
                System.out.print(", ");
            }
        }


        String tekstasA = "Hi mom!";
        String tekstasB = "hi mom!";

        String tekstasALower = tekstasA.toLowerCase();
        String tekstasBLower = tekstasB.toLowerCase();

        System.out.println(tekstasALower);
        System.out.println(tekstasBLower);
        System.out.println(tekstasALower == tekstasBLower);


        if(tekstasALower.equals(tekstasBLower))
        {
            System.out.println("texts are equal");
        }

        

    }
}
