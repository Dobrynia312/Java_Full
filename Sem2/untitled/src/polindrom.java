public class polindrom {
    public static void main(String[] args) {
                String line = "alwwla";
                System.out.println(check(line));
            }

            public static boolean check(String line){
                char[] arr = line.toCharArray();
                int size = arr.length;
                for (int i = 0; i < size / 2; i++){
                    if (arr[i] != arr[size - i - 1]){
                        return false;
                    }
                }

                return true;
            }

        }