public class Midian {
    
    public static void main(String[] arg){
        int [] score = {80, 90, 55, 76, 93, 83};

        for(int i = 0; i < score.length-1; i++){
            for(int j = i+1; j<score.length; j++){
                if(score[i] >score[j]){
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        double sum = score[2] + score[3];
        double mid = sum/2;

        System.out.println(mid);
    }
}
