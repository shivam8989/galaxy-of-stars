package training;

public class Galaxy_of_Stars {
    public static String[] Game(int n) {
        String arr[] = new String[n];
        String result = " ";
        for (int i = 1; i <= (n + 1) / 2; i++) {
            result = result + "*";
        }
        int count = 1;
        for (int i = 1; i <= n; i++) {
            if (i <= (n + 1) / 2) {
                arr[i - 1] = result.substring(0, count);
                count++;
                if (i == (n + 1) / 2) {
                    count--;
                }
            } else {
                count--;
                arr[i - 1] = result.substring(0, count);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 7;
        String arr[] = Game(7);
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        }
    }

