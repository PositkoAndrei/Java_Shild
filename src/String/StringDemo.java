package String;

public class StringDemo {
    public static void main(String[] args) {
        //Различные способы обьявления строк
        String str1 = new String("В Javaс троки - обьекты!");
        String str2 = "Их можна создавать разными способами!";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str2.equals(str3));
        System.out.println(str2 == str3);
    }
}
