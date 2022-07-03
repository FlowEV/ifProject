public class Main {
    public static void main(String[] args) {
        int userAge = 18;
        if(userAge >= 16){
            System.out.println("Access permitted");
        } else if(userAge<5){
            System.out.println("You too small");
        } else if(userAge == 18) {
            System.out.println("You are eighteen years old");
        }

    }
}