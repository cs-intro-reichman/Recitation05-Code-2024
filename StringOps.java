public class StringOps {
    public static void main(String[] args) {
        String empty = "";
        String w = "hello";
        System.out.println(w + empty);
        System.out.println(empty + w);
        String test = "world";
        System.out.println(w + test);
        System.out.println(test + w);
        String toAdd = ""+153;
        String res = "";
        for (int i = 0; i < toAdd.length(); i++) {
            res += toAdd.charAt(i) + " ";
        }
        res += "}";
        char c = 'c';
        
        System.out.println(res);
        System.out.println((int)c);
        System.out.println(c + 0);
        System.out.println((char)(c - 'a' + 'A'));
        c = '1';
        System.out.println((int)c);
        System.out.println(c + 0);
        System.out.println((c - '0'));
        System.out.println((char)(c - '0') == '1');
        System.out.println((char)(c - '0') == 1);
    }
}
