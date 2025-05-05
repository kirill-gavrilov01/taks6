public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(" Задача№1 ");
        int age = 17;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " то он совершеннолетний ");
        }
        if (age < 18) {
            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно не много подождать ");
        }
        System.out.println(" Задача№2");
        int temperature = 2;
        if (temperature >= 5) {
            System.out.println(" На улице холодно " + temperature + " градусов , нужно надеть шапку ");
        }
        if (temperature <= 5) {
            System.out.println(" Сегодня тепло " + temperature + " градусов, можно идти без шапки ");
        } else {
        }
        System.out.println(" Задача№ 3");
        int speed = 71;
        if (speed <= 60) {
            System.out.println(" Можно ездить спокойно ");
        } else {
            System.out.println(" Если скорость " + speed + " могут выписать штраф");
        }
        System.out.println(" Задача№4 ");
        int ages =25;
        if (ages >= 2 && ages <=6) {
            System.out.println(" Если возраст человека равен " + ages + " то ему надо ходить в детский сад");
        } else if (ages >= 7 && ages <=17) {
            System.out.println(" Если возраст человека равен " + ages + " то ему надо ходить в школу");
        } else  if (ages >=10 && ages <=24) {
            System.out.println(" Если возраст человека равен " + ages + " то ему надо ходить в университет");
        } else  {
            System.out.println(" Если возраст человека равен " + ages + " то ему надо ходить на работу");
        }
        System.out.println(" Задача№5");
        int age1 = 10;
        if (age < 5) {
            System.out.println(" Если возраст ребёнка равен " + age1 + " то ему нельзя кататься на атракционе ");
        } else if (age1 >= 5 && age1 < 14) {
                System.out.println(" Если возраст ребёнка равен " + age1 + " то ему можно кататься в сопровождении взрослого");
             {
                System.out.println(" Если возраст ребёнка равен " + age1 + " то ему нельзя кататься на атракционе");
            }
        } else if (age1 >= 5 && age1 < 14) {
            System.out.println(" Если возраст ребёнка равен" + age1 + " то ему можно кататься на атракционе");
        }

        System.out.println(" Задача№6 ");
        int passengers = 78;
        if (passengers < 60) {
            System.out.println(" Есть сидячие  места ");
        } else  if (passengers >= 60 && passengers <102) {
                 System.out.println(" Есть стоячие места");
             } else  {
                 System.out.println(" Мест нет");
        }


        System.out.println(" Задача№7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }
    }
}
