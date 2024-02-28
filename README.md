# ***Zadanie: Zarządzanie Listą Zadań (To-Do List)***

*Napisz program w języku Java, który pozwoli użytkownikowi tworzyć, przeglądać, modyfikować i usuwać zadania na liście "To-Do". Program powinien umożliwiać dodawanie zadań, oznaczanie zadań jako zakończone, usuwanie zadań i wyświetlanie listy zadań.*
> [!TIP]
## **_Wskazówki:_**


* Utwórz klasę `ToDoList`, która będzie zawierała metodę:
```java
  public static void main(String[] args){...}
```
* Użyj odpowiednich struktur danych, takich jak `ArrayList` lub `LinkedList`, do przechowywania zadań.
* Stwórz menu, które umożliwia użytkownikowi wybieranie operacji, takie jak dodawanie zadania, oznaczanie zadania jako zakończone, usuwanie zadania i wyświetlanie listy zadań.
* Każde zadanie na liście powinno zawierać nazwę, opis i flagę wskazującą, czy jest zakończone.
* Program powinien pozwalać użytkownikowi wykonywać te operacje aż do momentu, kiedy zdecyduje się wyjść z programu.
* Przykładowa sesja programu mogłaby wyglądać tak:

```
1. Dodaj nowe zadanie
2. Oznacz zadanie jako zakończone
3. Usuń zadanie
4. Wyświetl listę zadań
5. Wyjście

Wybierz opcję (1/2/3/4/5): 1
Podaj nazwę zadania: Zakupy spożywcze
Podaj opis zadania: Kupić mleko, chleb i jajka
Zadanie "Zakupy spożywcze" zostało dodane do listy.

Wybierz opcję (1/2/3/4/5): 4
Lista zadań:
1. [ ] Zakupy spożywcze: Kupić mleko, chleb i jajka

Wybierz opcję (2/3/4/5): 2
Podaj numer zadania do oznaczenia jako zakończone: 1
Zadanie "Zakupy spożywcze" zostało oznaczone jako zakończone.

Wybierz opcję (4/5): 4
Lista zadań:
1. [x] Zakupy spożywcze: Kupić mleko, chleb i jajka

Wybierz opcję (3/4/5): 3
Podaj numer zadania do usunięcia: 1
Zadanie "Zakupy spożywcze" zostało usunięte z listy.

Wybierz opcję (4/5): 4
Lista zadań:
(brak zadań)

Wybierz opcję (5): 5
Koniec programu.
```
