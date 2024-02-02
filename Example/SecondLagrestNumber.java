package Example;

public class SecondLagrestNumber {
    public static int findSecondLargestNUmber(int[] arrya){
        int highest = Integer.MIN_VALUE;
        int secondHighest =Integer.MIN_VALUE;

        for (int i :arrya){
            if (i>highest){
                secondHighest=highest;
                highest=i;
            }else if(i>secondHighest){
                secondHighest=i;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int arrya[] ={1,15,9,7,16,13};
        int result =findSecondLargestNUmber(arrya);
        System.out.println("Second largest number is == "+result);

    }
}
