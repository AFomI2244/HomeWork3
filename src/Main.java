public class Main {
    public static void main(String[] args) {
        //Задание 6
        System.out.println("Задание 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sumBoxers = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов: " + sumBoxers + "кг");
        var boxersWeightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов: " + boxersWeightDifference + "кг");

        //Задание 7
        System.out.println("Задание 7");
        System.out.println("1. Разница весов спортсменов: " + boxersWeightDifference + "кг");
        System.out.println("2. Разница весов спортсменов: " + (secondBoxer % firstBoxer) + "кг");

        //Задание 8
        System.out.println("Задание 8");
        var sumWorkHours = 640;
        var oneWorkerTime = 8;
        var sumWorkers = sumWorkHours / oneWorkerTime;
        System.out.println("1. Всего работников в компании – " + sumWorkers + " человек");

        sumWorkers = sumWorkers + 94;
        sumWorkHours = sumWorkers * oneWorkerTime;
        System.out.println("2. Если в компании работает " + sumWorkers + " человека, то всего " + sumWorkHours + " часа работы может быть поделено между сотрудниками");
    }
}