public class DisplayLE {
    public static void main(String[] ar){
        int [] score = {80, 90, 55, 76, 93, 83};

        int lowest = score[0];

        for (int myscore:score){
            if (lowest > myscore){
                lowest = myscore;
            }
        }

        System.out.println(lowest);
    }
}
