package Java.day06;

public class largetsnumber {
    public static void main(String[] args) {
        int [] numbers={10,50,30,70,20};
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]>sum ){
                sum=numbers[i];

            }
        }
        System.out.println(sum);
    }
}
