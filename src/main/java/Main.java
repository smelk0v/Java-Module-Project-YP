import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int carItem = 3; // задаем количество машин
        Car[] carsLeMan = new Car[carItem]; // создаём массив машин

//        for (Car iterNam:carsLeMan)  // форейч не получается:(
//            iterNam = new Car();

        for (int i=0; i < carsLeMan.length; i++)  // создаём объекты в массиве
            carsLeMan[i] = new Car();

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < carsLeMan.length; i++) {  // заполнение массива пользователем
            do { // зацикливаем ввод, пока не будет введено не пустое название машины
                System.out.println("Введите название машины №" + (i + 1));
                carsLeMan[i].name = scanner.next();
                if (carsLeMan[i].name.isEmpty())
                    System.out.println("Пустое название машины №" + (i + 1));
                else
                    break;
            } while (true);

            do { // зацикливаем ввод, пока не будет введена верная скорость (0-250)
                System.out.println("Введите скорость машины №" + (i + 1));
                String trySpeed = scanner.next();  // временная переменная для проверки целочисленного ввода
                try {
                    int speedInt = Integer.parseInt(trySpeed); // попытка преобразовать строку в целое число
                    if ((speedInt > 0) && (speedInt <= 250)) { // заканчиваем ввод скорости, если скорость  и >0, и <=250, и целое число
                        carsLeMan[i].speed = speedInt;
                        break;
                    } else
                        System.out.println("Неправильная скорость");
                } catch (NumberFormatException e) {
                    System.out.println("Неправильная скорость");
                }
            } while (true);
        }

        scanner.close();

        Race raceLeMan = new Race();
        Car winnerLeMan = raceLeMan.raceLeMan(carsLeMan);  // вызываем метод поиска победителя гонки
        System.out.println("Самая быстрая машина: " + winnerLeMan.name);
    }
}