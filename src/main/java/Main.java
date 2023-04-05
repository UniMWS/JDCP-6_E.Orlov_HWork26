import ru.netology.code.Usn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6_E.Orlov_Homework-4 --> JDCP-6_E.Orlov_HWork26");
        System.out.println();
        int income = 0; //доход
        int expense = 0;//расход
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию и введите её номер (или \"end\" для выхода):");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int select = Integer.parseInt(input);

            switch (select) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr1 = scanner.nextLine();
                    int money1 = Integer.parseInt(moneyStr1);
                    income += Math.abs(money1);
                    if (income < 17) System.out.println("Налог точно меньше рубля!");
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneyStr2 = scanner.nextLine();
                    int money2 = Integer.parseInt(moneyStr2);
                    expense += Math.abs(money2);
                    break;
                case 3:
                    int tax6 = Usn.taxIncome(income);//"УСН доходы 6"
                    int tax15 = Usn.taxIncomeExpense(income, expense);//"УСН доходы минус расходы 15"
                    if (Usn.compareTax(income, expense)) {//проверка на равенство
                        System.out.println("Дело вкуса: для общего дохода " + income + "р. и расхода " + expense + "р. налоги по " + tax6 + " рублей;)");
                    } else if (tax6 < tax15) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Для общего дохода " + income + "р. и расхода " + expense + "р. ваш налог составит: " + tax6 + " рублей");
                        System.out.println("Налог на другой системе: " + tax15 + " рублей");
                        System.out.println("Экономия: " + (tax15 - tax6) + " рублей");
                    } else {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Для общего дохода " + income + "р. и расхода " + expense + "р. ваш налог составит: " + tax15 + " рублей");
                        System.out.println("Налог на другой системе: " + tax6 + " рублей");
                        System.out.println("Экономия: " + (tax6 - tax15) + " рублей");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Такой операции \"" + input + "\" нет (некорректный ввод)");
                    System.out.println();
            }
        }
        System.out.println();
        System.out.println("Программа завершена!");
    }
}