package HW;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        CharacterNameGenerator characterNameGenerator = new CharacterNameGenerator();
        int choice = 0;
        System.out.println("Создание имени для персонажа");
        System.out.println("");
        while (choice != 7){
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить подлежащее");
            System.out.println("2. Добавить дополнение");
            System.out.println("3. Добавить определение");
            System.out.println("4. Сделать имя из полдежащего и дополнения");
            System.out.println("5. Сделать имя из полдежащего и определения");
            System.out.println("6. Сделать имя из полдежащего, дополнения и определения");
            System.out.println("7. Выход");
            System.out.println("Ваш выбор:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Какое подлежащее вы хотите добавить");
                        String answer = scanner.nextLine();
                        if (answer.isEmpty()){
                            throw new IllegalArgumentException("Ничего не введено");
                        }
                        characterNameGenerator.subjects.add(answer);
                        System.out.println("Поддежащее добавлено");
                        break;
                    case 2:
                        System.out.println("Какое дополнение вы хотите добавить");
                        answer = scanner.nextLine();
                        if (answer.isEmpty()){
                            throw new IllegalArgumentException("Ничего не введено");
                        }
                        characterNameGenerator.objects.add(answer);
                        System.out.println("Дополнение добавлено");
                        break;
                    case 3:
                        System.out.println("Какое определение вы хотите добавить");
                        answer = scanner.nextLine();
                        if (answer.isEmpty()){
                            throw new IllegalArgumentException("Ничего не введено");
                        }
                        characterNameGenerator.attributes.add(answer);
                        System.out.println("Определение добавлено");
                        break;
                    case 4:
                        System.out.println("Получилось имя:");
                        System.out.println(characterNameGenerator.generatorSubjectObject
                                (characterNameGenerator.subjects, characterNameGenerator.objects));
                        break;
                    case 5:
                        System.out.println("Получилось имя:");
                        System.out.println(characterNameGenerator.generatorAttributeSubject
                                (characterNameGenerator.subjects, characterNameGenerator.attributes));
                        break;
                    case 6:
                        System.out.println("Получилось имя:");
                        System.out.println(characterNameGenerator.generatorAttributeSubjectObject
                                (characterNameGenerator.subjects, characterNameGenerator.objects, characterNameGenerator.attributes));
                        break;
                    case 7:
                        System.out.println("Выход из программы. До свидания!");
                        break;
                    default:
                        throw new IllegalArgumentException("Ошибка! Выберите пункт от 1 до 7.");

                }

            }catch (IllegalArgumentException e){
                e.getMessage();
            }finally {

            }



        }


    }
}
