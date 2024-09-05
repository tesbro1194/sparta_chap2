import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        int score = (int) sc.nextDouble();
        double percent = (((double) score / 5) * 100);

        sc.nextLine();

        String[] recipe = new String[10];
        for(int i = 0; i < 10; i++) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine + i);
            recipe[i] = currentLine;
        }

        System.out.println();
        System.out.println("[ " + title + " ]");
        System.out.println("별점 : " +  score + "(" + percent + "%)");
        for(int i = 0; i < recipe.length; i++) {
            System.out.println(i + 1 + ". " + recipe[i]);
        }
    }
}
