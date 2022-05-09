package fr.exo5;

public class LeProf {

    public static void flemme(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 4 && arr[i] >= 0)
                System.out.println(arr[i] + " --> Catastrophique, il faut tout revoir");
            else if (arr[i] <= 10 && arr[i] >= 0)
                System.out.println(arr[i] + " --> insuffisant");
            else if (arr[i] <= 14 && arr[i] >= 0)
                System.out.println(arr[i] + " --> Peut mieux faire");
            else if (arr[i] <= 17 && arr[i] >= 0)
                System.out.println(arr[i] + " --> Bien");
            else if (arr[i] <= 20 && arr[i] >= 0)
                System.out.println(arr[i] + " --> Excellent, bon travail");
            else
                System.out.println(arr [i] + " --> note invalide");
        }
    }
}

