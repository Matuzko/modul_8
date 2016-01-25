package lecture8.second;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Rose firstRose = new Rose(20, "red");
        Rose secondRose = new Rose(20, "red");
        Rose thirdRose = new Rose(20, "red");
        Rose foursRose = new Rose(20, "red");
        Astra firstAstra = new Astra(15, "white");
        Chamomile firstChamomile = new Chamomile(15, "white");

        ArrayList <Flower> flowerList = new ArrayList<>();
        flowerList.add(firstAstra);
        flowerList.add(firstChamomile);
        flowerList.add(firstRose);
        flowerList.add(secondRose);
        flowerList.add(thirdRose);
        flowerList.add(foursRose);

        for (Flower a:flowerList
                ) {
            System.out.println("This is a flower "+a.getColor()+" color. And it have size "+a.getSize()+"sm");
        }

    }
}
