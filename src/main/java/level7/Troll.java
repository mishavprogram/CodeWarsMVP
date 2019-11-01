package level7;

public class Troll {

    public static String disemvowel(String str) {
        String[] vovels = {"a", "e", "i", "o", "u"};

        for (String vovel :
            vovels) {
            str = str.replaceAll(vovel, "");
            str = str.replaceAll(vovel.toUpperCase(), "");
        }
        return str;
    }
}
