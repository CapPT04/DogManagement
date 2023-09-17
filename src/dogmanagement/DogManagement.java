
package dogmanagement;

import Data.Dog;


public class DogManagement {

 
    public static void main(String[] args) {
        Dog chiHu = new Dog("CHIHUHU", 2021, 1);
        chiHu.bark();
        Dog ngaoDa = new Dog("Ngao Da", 2020, 50);
        ngaoDa.bark();
        chiHu.setNewWeight(5);
        chiHu.bark();
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
    }
    
}
