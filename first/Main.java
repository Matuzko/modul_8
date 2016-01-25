package lecture8.first;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AudioFile song = new AudioFile("mp3", 2080, true);
        AudioFile song2 = new AudioFile("mp3", 200, true);
        AudioFile song1 = new AudioFile("mp3", 1200, true);
        ImageFile photo = new ImageFile("jpeg", 1200, false);
        ImageFile photo1 = new ImageFile("jpeg", 1070, false);
        ImageFile photo2 = new ImageFile("jpeg", 100, false);
        TextFile textFile = new TextFile("doc", 102376,false);
        TextFile textFile1 = new TextFile("doc", 108376,false);
        TextFile textFile2 = new TextFile("doc", 1028376,false);

        ArrayList <File> list = new ArrayList<>();
        list.add(song);
        list.add(song1);
        list.add(song2);
        list.add(photo);
        list.add(photo1);
        list.add(photo2);
        list.add(textFile);
        list.add(textFile1);
        list.add(textFile2);


        for (File a:list
             ) {
            System.out.println("This is a "+a.getFormat()+" format. And it have size"+a.getSize()+"Kb");
        }


    }



}






