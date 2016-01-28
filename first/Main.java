package lecture8.first;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Создание экземпляров
        AudioFile song = new AudioFile("mp3", 2080, true);
        AudioFile song2 = new AudioFile("mp3", 200, true);
        AudioFile song1 = new AudioFile("mp3", 1200, true);
        ImageFile photo = new ImageFile("jpeg", 1220, false);
        ImageFile photo1 = new ImageFile("jpeg", 1070, false);
        ImageFile photo2 = new ImageFile("jpeg", 100, false);
        TextFile textFile = new TextFile("doc", 102376, false);
        TextFile textFile1 = new TextFile("doc", 108376, false);
        TextFile textFile2 = new TextFile("doc", 1028376, false);
        //Создание и иннициализация списка файлов
        ArrayList<File> list = new ArrayList<>();
        list.add(song);
        list.add(song1);
        list.add(song2);
        list.add(photo);
        list.add(photo1);
        list.add(photo2);
        list.add(textFile);
        list.add(textFile1);
        list.add(textFile2);

        //Выводим файлы табличкой переопределенным toString
        for (File a : list
                ) {
            System.out.println(a.toString());
        }
        //Начинаем сортировку
        //Создаем массив инт так как сортируем по размеру и знаем количество елементов
        int massive[] = new int[list.size()];
        int count = 0;
        //Переносим значения в массив
        for (File a : list
                ) {
            massive[count] = a.getSize();
            count++;
        }
        //Выводим массив для наглядности
        System.out.println(Arrays.toString(massive));
        //сортируем по алгоритму с 5 модуля
        for (int i = 0; i < massive.length; i++) {
            int index = i;
            boolean needChange = false;
            for (int j = i + 1; j < massive.length; j++)
                if (massive[j] < massive[index]) {
                    index = j;
                    needChange = true;
                }


            if (needChange) {
                int smallerNumber = massive[index];
                massive[index] = massive[i];
                massive[i] = smallerNumber;

            }

        }
        //Опять выводим для проверки
        System.out.println(Arrays.toString(massive));
        //Создаем список для отсортированых файлов по размеру
        ArrayList<File> sortedList = new ArrayList<>();

        //Поиск  совпадений по значению и перенос в новый список от меньшего
        count = 0;
        for (int i = 0; i < massive.length; i++) {

            for (File a : list
                    ) {
                if (massive[i] == a.getSize()) {

                    sortedList.add(a);
                    count++;
                }

            }
        }
        //Вывод таблицей на экран
        for (File a : sortedList
                ) {
            System.out.println(a.toString());
        }


    }
}









