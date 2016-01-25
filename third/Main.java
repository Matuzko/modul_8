package lecture8.third;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar(6,"black");
        Guitar guitar1 = new Guitar(4,"black");
        Piano piano = new Piano(40, "white");
        Piano piano1 = new Piano(60, "white");

        ArrayList<MusicalInstrument> instrumentArrayList = new ArrayList<>();
        instrumentArrayList.add(guitar);
        instrumentArrayList.add(guitar1);
        instrumentArrayList.add(piano);
        instrumentArrayList.add(piano1);

        for (MusicalInstrument a:instrumentArrayList
             ) {
            System.out.println("It is "+a.getColor()+" color. It have "+a.getNumberOfStrings()+" strings");
        }

    }

}
