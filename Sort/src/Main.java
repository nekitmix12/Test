import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =-6;i<10;i++)
            a.add(i);

        ArrayList<Integer> b = new ArrayList<>();
        for(int i =-5;i<10;i++)
            b.add(i);

        ArrayList<Integer> ref = sort(b,a);

        System.out.println(findTimeFire(11,2));


    }


    private static ArrayList<Integer> sort(ArrayList<Integer> firstArray,
                                    ArrayList<Integer> secondArray) {
        ArrayList<Integer> finalArray = new ArrayList<>();
        int i = firstArray.size()-1,j=secondArray.size()-1;
        while (i+j!=0)
        {
            if(i==0)
            {
                finalArray.add(secondArray.get(j));
                j--;
            }
            else if(j==0)
            {
                finalArray.add(firstArray.get(i));
                i--;
            }
            else if(firstArray.get(i)>secondArray.get(j)){
                finalArray.add(firstArray.get(i));
                i--;
            }
            else {
                finalArray.add(secondArray.get(j));
                j--;
            }
        }
        return finalArray;

        //аналогично для строк
    }

    private static int findTimeFire(int numberLight, int numbersCraft){
        int countBurned = numberLight, time = 0;

        if(numbersCraft<=2)return (int) Double.POSITIVE_INFINITY;
        else{
            while(countBurned>=numbersCraft){
                time+=2*numberLight;
                numberLight = countBurned/numbersCraft;
                countBurned=countBurned/numbersCraft*2 + countBurned%numbersCraft;

            }
        }
        return time;
    }


}