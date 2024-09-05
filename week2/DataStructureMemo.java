import java.io.IOException;
import java.util.*;

public class DataStructureMemo {

    static final String END_COMMAND = "끝";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String collectionType = sc.nextLine();
        String title = sc.nextLine();

        String line;
        switch (collectionType) {
            case "List":
                List<String> recipes = new ArrayList<>();

                while(!(line = sc.nextLine()).equals(END_COMMAND)) {
                    recipes.add(line);
                }

                printTitle(collectionType, title);
                for (int i = 0; i < recipes.size(); i++) {
                    System.out.println(i + 1 + ". " + recipes.get(i));
                }
                break;
            case "Set":
                Set<String> recipeSet = new HashSet<>();

                while(!(line = sc.nextLine()).equals(END_COMMAND)) {
                    recipeSet.add(line);
                }

                printTitle(collectionType, title);
                Iterator<String> iterator = recipeSet.iterator();
                for (int i = 0; i < recipeSet.size(); i++) {
                    System.out.println(i + 1 + ". " + iterator.next());
                }
                break;
            case "Map":
                Map<Integer, String> recipeMap = new HashMap<>();

                int index = 0;
                while(!(line = sc.nextLine()).equals(END_COMMAND)) {
                    recipeMap.put(index, line);
                    index++;
                }

                printTitle(collectionType, title);
                for (int i = 0; i < recipeMap.size(); i++) {
                    System.out.println(i + 1 + ". " + recipeMap.get(i));
                }
                break;
        }
    }

    static void printTitle(String collectionType, String title) {
        System.out.println("[ " + collectionType + "로 저장된 " + title + " ]");
    }
}
