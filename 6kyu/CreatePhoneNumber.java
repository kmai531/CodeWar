public class CreatePhoneNumber {
    class Solution {
        public static String createPhoneNumber(int[] numbers) {
            // Your code here!
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            for(int i = 0; i < numbers.length; i++) {
                if(i == 3) {
                    sb.append(")");
                }
                else if(i == 6) {
                    sb.append("-");
                }
                sb.append(numbers[i]);
            }
            return sb.toString();
        }
    }
}