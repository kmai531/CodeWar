
public class VowelCount {
    public class Vowels {

        public static int getCount(String str) {
          int count = 0;
          for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
          }
          return count;
        }
      
      }
}
