package lesson2;

import java.io.File;

public class Task5 {
//    Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//    Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//    Обработайте ошибки с помощью try-catch конструкции.
//    В случае возникновения исключения, оно должно записаться в лог-файл.


    public static void main(String[] args){

        File dir = new File("C:\\Users\\user\\Desktop\\java.practic\\java.practic13042023");
// если объект представляет каталог
        if(dir.isDirectory())
        {
// получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + " \t folder");
                }
                else{

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}
