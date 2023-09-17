
package Data;


public class Dog {
    private String name;
    private int yob;
    private double weight;
    
    
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    public void bark() {
    //    System.out.println("Gogogogogo.... my name is " + name);
    //    System.out.println("Gogogogo... my yob is " + yob);
        System.out.printf("|%-10s|%4d|%4.1f| \n",name,yob, weight);
        
    }
    public void setNewWeight (double newWeight) {
        weight = newWeight;
    }
    public int getYob() {
        return yob;
    }
}
