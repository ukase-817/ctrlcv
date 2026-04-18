public class Exp2_2 {
    public static void main(String[] args){
        String strIm = " I am a student. I like Java Language! ";
        System.out.println(strIm.length());
        System.out.println(strIm.charAt(0));
        System.out.println(strIm.charAt(strIm.length() - 1));
        System.out.println(strIm.indexOf("student"));
        System.out.println(strIm.trim());
        System.out.println(strIm.substring(2,6));
        String[] words = strIm.trim().split("\\s+");
        for(String word : words){
            System.out.println(word);
        }
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word).append(" ");
        }
        System.out.println(sb.toString().trim());
        System.out.println(strIm.toUpperCase());
    }
}