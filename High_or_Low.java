
package high_or_low;

/**
 *
 * @author kimgabriell
 */
public class High_or_Low {
    
    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 50) {
            System.out.println("The Number is Small");
                    
        }   else if (x >= 51 && x <=100) {
            System.out.println("The Number is Big");
            
        }   else {
            System.out.println("The Number is out of range");
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(11);
        howBigIsMyNumber(100);
        howBigIsMyNumber(5);
        howBigIsMyNumber(75);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(105);
    }
    
}
