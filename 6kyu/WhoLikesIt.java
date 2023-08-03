public class WhoLikesIt {
    class Solution {
        public static String whoLikesIt(String... names) {
            int arrSize = names.length;
            if(arrSize == 0) {
                return "no one likes this";
            }
            else if(arrSize == 1) {
                return names[0] + " likes this";
            }
            else if(arrSize == 2) {
                return names[0] + " and " + names[1] + " like this";
            }
            else if (arrSize == 3) {
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            } else {
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
            }
        }
    }
}
