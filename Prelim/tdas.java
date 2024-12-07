public class tdas {
    public static void main (String[] args) {
        int tarr[][] = {{4, 2, 9, 7, 3}, {8, 5, 1, 6, 10}};

        System.out.print("Original Int Array: " + "\n" );
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(tarr[i][j] + " ");
            }            
        }

        System.out.print("\n" + "\n");
        intsort(tarr);

        String tarr2[][] = {{"Gian", "Carla", "Aaron", "Nelmar", "Kevin"}, 
        {"Darwin", "Angel", "Vincent", "Zyron", "Rhancel"}};

        System.out.print("Original String Array: " + "\n" );
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(tarr2[i][j] + " ");
            }            
        }

        System.out.print("\n" + "\n");
        strsort(tarr2);
    }

    public static void intsort (int tarr[][]){

        for (int i = 0; i <= 6; i++){
            if (i<=4){
                for (int j = i+1; j <= 5; j++){
                    if (j<5){
                        if(tarr[0][i]>tarr[0][j]){
                            int temp = tarr[0][i];
                            tarr[0][i] = tarr[0][j];
                            tarr[0][j] = temp;
                        }
                    }
                    else if(j==5){
                        for (int a = 0; a < 4; a++){
                            for (int b = a; b < 5; b++){
                                if(tarr[0][a]>tarr[1][b]){
                                    int temp = tarr[0][a];
                                    tarr[0][a] = tarr[1][b];
                                    tarr[1][b] = temp;
                                }               
                            }
                        }
                    }               
                }
            }
            else if (i==5){
                int ind = i-1;
                for(int x = 0; x < 5; x++){
                    if(tarr[0][ind]>tarr[1][x]){
                        int temp = tarr[0][ind];
                        tarr[0][ind] = tarr[1][x];
                        tarr[1][x] = temp;
                    } 
                }
            }
            else if (i==6){
                for(int y = 0; y < 4; y++){
                    for(int z = y+1; z < 5; z++ ){
                        if(tarr[1][y]>tarr[1][z]){
                            int temp = tarr[1][y];
                            tarr[1][y] = tarr[1][z];
                            tarr[1][z] = temp;
                        }
                    }
                }
            }            
        }

        System.out.print("Sorted Int Array: " + "\n" );
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(tarr[i][j] + " ");
            }            
        }

        System.out.print("\n" + "\n");
    }

    public static void strsort(String tarr2[][]){
        for (int i = 0; i <= 6; i++){
            if (i<=4){
                for (int j = i+1; j <= 5; j++){
                    if (j<5){
                        if(tarr2[0][i].compareTo(tarr2[0][j]) > 0){
                            String temp = tarr2[0][i];
                            tarr2[0][i] = tarr2[0][j];
                            tarr2[0][j] = temp;
                        }
                    }
                    else if(j==5){
                        for (int a = 0; a < 4; a++){
                            for (int b = a; b < 5; b++){
                                if(tarr2[0][a].compareTo(tarr2[1][b]) > 0){
                                    String temp = tarr2[0][a];
                                    tarr2[0][a] = tarr2[1][b];
                                    tarr2[1][b] = temp;
                                }               
                            }
                        }
                    }               
                }
            }
            else if (i==5){
                int ind = i-1;
                for(int x = 0; x < 5; x++){
                    if(tarr2[0][ind].compareTo(tarr2[1][x]) > 0){
                        String temp = tarr2[0][ind];
                        tarr2[0][ind] = tarr2[1][x];
                        tarr2[1][x] = temp;
                    } 
                }
            }
            else if (i==6){
                for(int y = 0; y < 4; y++){
                    for(int z = y+1; z < 5; z++ ){
                        if(tarr2[1][y].compareTo(tarr2[1][z]) > 0){
                            String temp = tarr2[1][y];
                            tarr2[1][y] = tarr2[1][z];
                            tarr2[1][z] = temp;
                        }
                    }
                }
            }            
        }

        System.out.print("Sorted String Array: " + "\n" );
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(tarr2[i][j] + " ");
            }            
        }

        System.out.print("\n" + "\n");
    }
}