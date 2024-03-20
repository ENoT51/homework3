
public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Вам есть 18 лет");
        } else {
            System.out.println("Возраст совершеннолтеия не насптупил, нужно подождать.");

        }


        // task 2
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //task 3
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Скорость превышена");
        } else {
            System.out.println("Превышения скорости нет");
        }
        //task 4
        System.out.println("Задача 4");
        int humanAge = 26;
        if (humanAge < 2) {
            System.out.println("Вы ввели некорректные даныне");
        } else if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить в садик");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить в университет");
        } else if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить на работу");
        }

    // Задача 5

        System.out.println("Задача 5");
    int age2 = 14;
    if (age2 < 5){
        System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на атракционе");
    } else if (age2>=5 && age2 < 14){
        System.out.println("Если возраст ребенка равен " + age2 + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
    } else if (age2>= 14) {
        System.out.println("Если возраст ребенка равен " + age2 + " то он может кататься без сопровождения взрослого.");
    }
    // Задача 6
        System.out.println("Задача 6");
    int van = 102;
    if (van < 60){
        System.out.println("В вагоне есть сидячие места");
    } else if (van >= 60 && van < 102) {
        System.out.println("В вагоне остались только стоячие метса");
    } else if (van >= 102) {
        System.out.println("Вагон забит");
    }
    // Задача 7
        System.out.println("Задача 7");
    int one = 1;
    int two = 14;
    int three = 110;
    boolean oneBiggest = one > two && one > three;
    boolean twoBiggest = two > one && two > three;
    if (oneBiggest){
        System.out.println("Первое число наибольшее");
    } else if (twoBiggest){
        System.out.println("Второе число наибольшее");
    } else {
        System.out.println("Третье число наибольшее");
    }
    }

    }

