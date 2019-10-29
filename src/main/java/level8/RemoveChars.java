package level8;

public class RemoveChars {

    public static String remove(String str) {
        return str.substring(1, str.length()-1);
    }

    public static String remove2(String str){
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i=1; i<=str.length()-2; i++){
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
