import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
//        MENU
        Scanner scan = new Scanner(System.in);
        int exit =0;
        int doSwitcha = 5;
        while (exit == 0){
            System.out.println("1. Dodaj nowe zadanie\n" +
                    "2. Oznacz zadanie jako zakończone\n" +
                    "3. Usuń zadanie\n" +
                    "4. Wyświetl listę zadań\n" +
                    "5. Wyjście\n" +
                    "\n" +
                    "Wybierz opcję (1/2/3/4/5): ");
            doSwitcha = scan.nextInt();
            
            switch(doSwitcha) {
                case 1:
                    toDoList.addTask();
                    //Tworzy liste
                    break;
                case 2:
                    toDoList.markTaskAsDone();
                    //odznacza liste jako wykonaną
                    break;
                case 3:
                    toDoList.removeTask();
                    //usuwa liste
                    break;
                case 4:
                    toDoList.displayList();
                    //wyświetla listę
                    break;
                case 5:
//                    System.out.println("chuj");
                        exit = 1;
                    //wychodzi z programu
                    break;
                default:
                    break;

            }
        }
    }
}