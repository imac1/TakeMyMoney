public class reverseArraySpecialCharacters {

    public static void main(String[] args) {

        // reverse array without moving the special characters
        String str = "a, b, #, c";
        char[] arr = str.toCharArray();
        System.out.println(arr);
        reverseStr(arr);
        String resultRev = new String(arr);
        System.out.println(resultRev);

    }

    public static void reverseStr(char[] arr) {
        // mark the begining and the ending of the array
        int right = arr.length - 1;
        int left = 0;
        // go over array from both ends until l and r
        while (left < right) {
            if (!Character.isAlphabetic(arr[left])) {
                left++;
            } else if (!Character.isAlphabetic(arr[right])) {
                right--;
            }
            // if both right and left are not spacial

            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }

    }
}
