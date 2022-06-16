import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LinkedList.LinkedListException {
        LinkedList<Integer> list = new LinkedList<>();
        int repeats = enterRepeats();
        addElementsInList(list, repeats);

        System.out.print("Исходный список: ");
        printList(list);

        list.checkAndRemoveEvenElements(list);

        System.out.print("Получившийся список: ");
        printList(list);
    }

    private static int enterRepeats() {
        System.out.println("Введите количество элементов списка (натуральное число): ");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        while (count <= 0) {
            System.out.println("Неверно введено количество элементов. Попробуйте снова");
            count = enterRepeats();
        }

        return count;
    }

    private static void addElementsInList(LinkedList<Integer> list, int repeats) {
        System.out.println("Введите " + repeats + " элементов списка: ");
        int k = 0;

        while (repeats != 0) {
            Scanner scanner = new Scanner(System.in);
            int element = scanner.nextInt();

            list.addElementByIndex(k, element);
            k++;
            repeats--;
        }
    }

    public static void printList(LinkedList<Integer> list) {
        int i = 0;
        for (Integer value : list) {
            System.out.print((i > 0 ? ", " : "") + value);
            i++;
        }
        System.out.println();
    }
}