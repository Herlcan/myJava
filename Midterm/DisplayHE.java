public class DisplayHE {

    public static void main(String[] ar){
        int [] score = {80, 90, 55, 76, 93, 83};

        int high = score[0];

        for (int myscore:score){
            if (high < myscore){
                high = myscore;
            }
        }

        System.out.println(high);
    }
}
