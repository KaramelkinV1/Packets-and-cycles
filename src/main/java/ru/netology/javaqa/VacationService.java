package ru.netology.javaqa;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // Счетчик месяцев отдыха
        int money = 0; // Изначально у фрилансера нет денег

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // Если денег хватает на отдых
                count++; // Увеличиваем счётчик отдыха
                money = money - expenses; // Вычитаем обязательные траты
                money = money / 3; // Остаток уменьшается в три раза
            } else { // Если денег мало — приходится работать
                money = money + income - expenses; // Доход минус траты
            }
        }

        return count; // Возвращаем итоговое количество месяцев отдыха
    }
}
