public class Regex1 {
    public static void main(String[] args) {
        String str = "I Like to code near the Lake with my friend Luke";
        String regex = "(?i)(?<!friend\\s)l\\w*ke";
        String result = str.replaceAll(regex, "BLA");
        System.out.println(result);
    }
}
