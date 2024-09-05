import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("저장할 컬렉션을 선택해주세요");
        System.out.println("1. List");
        System.out.println("2. Set");
        System.out.println("3. Map");
        String collection = sc.nextLine();

        switch (collection){
            case "List":
                ArrayList<String> recipe1 = new ArrayList<>();

                System.out.println("제목을 작성해주세요");
                String title1 = sc.nextLine();

                title1 = "[ List으로 작성된 " + title1 + " ]";

                System.out.println("조리법을 한 줄씩 입력해주세요");
                System.out.println("작성이 끝나면 '끝'을 입력해주세요");
                while (true){

                    String contents = sc.nextLine();
                    if(Objects.equals(contents,"끝")){
                        break;
                    }
                    recipe1.add(contents);
                }

                System.out.println(title1);
                for (int i = 0;i<recipe1.size();i++){
                    System.out.println((i+1)+". "+recipe1.get(i));
                }
                break;

            case "Set":

                Set<String> recipe2 = new HashSet<>();

                System.out.println("제목을 작성해주세요");
                String title2 = sc.nextLine();

                title2 = "[ Set으로 작성된 " + title2+ " ]";

                System.out.println("조리법을 한 줄씩 입력해주세요");
                System.out.println("작성이 끝나면 '끝'을 입력해주세요");
                while (true){

                    String contents = sc.nextLine();
                    if(Objects.equals(contents,"끝")){
                        break;
                    }
                    recipe2.add(contents);
                }

                System.out.println(title2);
                Iterator iterator = recipe2.iterator();
                for (int i = 0;i<recipe2.size();i++){
                    System.out.println((i+1)+". "+iterator.next());
                }
                break;

            case "Map":
                HashMap<Integer,String> recipe3 = new HashMap<>();

                System.out.println("제목을 작성해주세요");
                String title3 = sc.nextLine();

                title3 = "[ Map으로 작성된 " + title3+ " ]";

                System.out.println("조리법을 한 줄씩 입력해주세요");
                System.out.println("작성이 끝나면 '끝'을 입력해주세요");
                int num = 0;
                while (true){

                    String contents = sc.nextLine();
                    if(Objects.equals(contents,"끝")){
                        break;
                    }
                    recipe3.put( num++ ,contents);
                }

                System.out.println(title3);
                for (int i = 0;i < recipe3.size();i++){
                    System.out.println((i+1)+". "+recipe3.get(i));
                }
                break;
        }


    }
}

