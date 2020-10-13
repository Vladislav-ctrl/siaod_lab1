package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashTable table=new HashTable(10);

        boolean bool=true;
        while(bool){
            System.out.println("Выберите пункт");
            System.out.println("1)Добваить слово");
            System.out.println("2)Удалить слово");
            System.out.println("3)Найти слово");
            System.out.println("4)Вывести содержимое словаря на экран");
            System.out.println("5)Закончить программу");

            Scanner scan1=new Scanner(System.in);
            if(scan1.hasNextInt()){
                int change=scan1.nextInt();
                Scanner scan=new Scanner(System.in);
                switch(change){
                    case 1:System.out.println("Введите слово:");
                            String adding_word=scan.nextLine();
                            table.add(adding_word);
                            System.out.println("Слово успешно добавлено");
                            break;
                    case 2:System.out.println("Введите удаляемое слово:");
                            String removing_word=scan.nextLine();
                            if(table.find(removing_word)){
                                table.remove(removing_word);
                                System.out.println("Слово успешно удалено");
                            }else{
                                System.out.println("Данное слово не найдено");
                            }
                            break;
                    case 3:System.out.println("Введите слово,которое хотите найти:");
                            String finding_word=scan.nextLine();
                            if(table.find(finding_word)){
                                System.out.println("Слово найдено");
                            }else{
                                System.out.println("Слово не найдено");
                            }
                            break;
                    case 4:for(int i=0;i<table.size();i++){
                                for(int j=0;j<table.get(i).size();j++){
                                    System.out.println(table.get(i).get(j));
                                }
                            }
                            break;
                    case 5:bool=false;
                        break;
                    default: System.out.println("Вы не выбрали пункт");
                }
            }
        }

    }
}
