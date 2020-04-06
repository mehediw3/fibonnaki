
package arraytwo;

public class ArrayTwo {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int a ;
        for(int n = 0;n<= 100;n++){
            a = i + j;
            i = j;
            j = a;
            n = i+j;
            
            System.out.println(i+" + "+j+" = "+n);
           
        }
    }
    
}
