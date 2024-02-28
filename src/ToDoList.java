import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    Scanner scan = new Scanner(System.in);

    ArrayList<String> tasks = new ArrayList<String>();
    int nr = 1;
    public void addTask() {
        //Tworzy liste
        System.out.println("Podaj nazwę zadania: ");
        String taskName = scan.nextLine();
        System.out.println("Podaj opis zadania: ");
        String taskDescription = scan.nextLine();
        tasks.add(nr-1,nr+". [ ] "+taskName + " - " + taskDescription);
        nr++;

    }
    public void markTaskAsDone() {
        System.out.println("Podaj numer zadania, które chcesz oznaczyć jako zakończone: ");
        int taskNumber = scan.nextInt();
        tasks.set(taskNumber-1,tasks.get(taskNumber-1).replace("[ ]", "[x]"));
        //odznacza liste jako wykonaną
    }
    public void removeTask() {
        System.out.println("Podaj numer zadania, które chcesz usunąć: ");
        int taskInt = scan.nextInt();
        tasks.remove(taskInt-1);
        //usuwa liste
    }
    public void displayList() {
        if(!tasks.isEmpty()){
        for (String task : tasks) {
            System.out.println(task);
            }
        }else {
            System.out.println("Lista jest pusta");
        }
        //wyświetla listę
    }
}
