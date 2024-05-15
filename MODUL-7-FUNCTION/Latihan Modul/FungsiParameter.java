public class FungsiParameter {
    
    public static String PesanRohani(String psn){
        System.out.println("Berusaha Tanpa Berdoa itu "+psn);
        return psn;
    }

    public static String PesanDuniawi(String psn){
        System.out.println("Berdoa tanpa usaha itu "+psn);
        return psn;
    }

    public static void main(String[] args) {
        PesanRohani("Sombong");
        PesanDuniawi("Koyol");
    }
}
