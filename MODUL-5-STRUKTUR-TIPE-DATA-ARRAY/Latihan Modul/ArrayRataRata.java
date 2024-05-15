public class ArrayRataRata 
{
    public static void main(String[] args)
    {
        int[] bil = {60,70,80};
        double rata=0.0;

        for(int a=0;a<bil.length;a++)
        rata += bil [a];
        rata /=bil.length;
        System.out.println("nilai rata-rata deret angka 60,70,80 adalah " + rata);
    }
}