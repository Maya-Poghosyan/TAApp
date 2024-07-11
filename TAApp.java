public class TAApp {
    public static void main(String[] args) {
        int test = nextOccurrence("heyhey-friend", 1, "hey");
        System.out.println(test);
    }

    public static int nextOccurrence(String baseStr, int startIndex, String subStr) {
        int subLength = subStr.length();
        for (int i=startIndex; i<baseStr.length()-subLength; ++i) {
            String possibleSubStr = "";
            for (int j=0; j<subStr.length(); ++j) {
                possibleSubStr += baseStr.substring(i+j, i+j+1);
            }
            if (possibleSubStr.equals(subStr)) {
                return(i);
            }
        }
        return(-1);
    }
}
