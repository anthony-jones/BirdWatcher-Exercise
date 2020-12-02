
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Bird> birdList = new ArrayList<>();
        boolean quit = false;
        while(!quit){
            System.out.print("? ");
            String input = scanner.nextLine();
            switch(input){
                case "Add":
                    addBird(birdList);
                    break;
                    
                case "Observation":
                    addObservation(birdList);
                    break;
                    
                case "All":
                    printBirds(birdList);
                    break;
                    
                case "One":
                    printOne(birdList);
                    break;
                    
                case "Quit":
                    quit = true;
                    break;
                    
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
    
    private static int birdCheck(String name, ArrayList<Bird> birdList){
        int index = -1;
        for(int i = 0; i < birdList.size(); i++){
            if(birdList.get(i).getName().equals(name)){
                index = i;
            } 
        }
        return index;
    }    
    
    private static void addBird(ArrayList<Bird> birdList){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        if(birdCheck(name, birdList) != -1){
            System.out.println("Duplicate exists, bird not added.");
        } else{
            System.out.print("Name in Latin: ");
            String latinName = scanner.nextLine();
            Bird bird = new Bird(name, latinName);
            birdList.add(bird);
        }
    }
    
    private static void addObservation(ArrayList<Bird> birdList){
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        if(birdCheck(birdName, birdList) != -1){
            birdList.get(birdCheck(birdName,birdList)).addObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    private static void printBirds(ArrayList<Bird> birdList){
        for(int i = 0; i < birdList.size(); i++){
            System.out.println(birdList.get(i));
        }
    }
    
    private static void printOne(ArrayList<Bird> birdList){
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        if(birdCheck(name, birdList) != -1){
            System.out.println(birdList.get(birdCheck(name, birdList)));
        } else {
            System.out.println("Not a bird!");
        }
    } 
}
