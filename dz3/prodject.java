// 1)В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.

// 2)Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>)
//  в предыдущем ДЗ, предоставив собственную реализацию.


package dz3;

import java.util.ArrayList;
import java.util.List;

/**
 * prodject
 */
public class prodject {
    
    public static void main(String[] args) {
        List<Sedan> CatalogCarsSedan = new ArrayList<>();
        List<SUV> CatalogCarsSUV = new ArrayList<>();
        Sedan car1 = new Sedan("bmw", 12, 1700000);
        Sedan car2 = new Sedan("VOlwa", 4, 3000000);
        SUV car3 = new SUV("Gaz", 1, 1003000);
        SUV car4 = new SUV("Mers", 14, 2100000);
        CatalogCarsSedan.add(car1);
        CatalogCarsSedan.add(car2);
        CatalogCarsSUV.add(car3);
        CatalogCarsSUV.add(car4);

        for(Sedan car: CatalogCarsSedan){
            System.out.println(car.GetCar());
        }

        for(SUV car: CatalogCarsSUV){
            System.out.println(car.GetCar());
        }

        CatalogCarsSedan.sort(null);
        
        Price<Integer> nowPrice = (a,b) -> b / a * 10; //рандомная формула. нз как цену высчитывать

        System.out.println(nowPrice.getNowPrice(car1.getAge(), car1.getPrice()));

        for(Sedan car: CatalogCarsSedan){
            System.out.println(car.GetCar());
        }
    }
}
    
    
