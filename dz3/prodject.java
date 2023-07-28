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
        List<Cars> CatalogCars = new ArrayList<>();
        Cars car1 = new Cars("bmw", 12, 1700000);
        Cars car2 = new Cars("VOlwa", 4, 3000000);
        Cars car3 = new Cars("Gaz", 1, 1003000);
        Cars car4 = new Cars("Mers", 14, 2100000);
        CatalogCars.add(car1);
        CatalogCars.add(car2);
        CatalogCars.add(car3);
        CatalogCars.add(car4);

        for(Cars car: CatalogCars){
            System.out.println(car.GetCar());
        }

        CatalogCars.sort(null);
        
        Price<Integer> nowPrice = (a,b) -> b / a * 10; //рандомная формула. нз как цену высчитывать

        System.out.println(nowPrice.getNowPrice(car1.getAge(), car1.getPrice()));

        for(Cars car: CatalogCars){
            System.out.println(car.GetCar());
        }
    }
}
    
    
