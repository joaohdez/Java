import java.util.Arrays;

public class ImutableArray {
    private int[] array;
    private volatile int hash = 0;

    public ImutableArray (int[] initial){
        array = initial.clone();
    }

 @Override
    public int hashCode(){
int h = hash;

if (h==0){
    h = Arrays.hashCode(array);
    hash = h;
}
return h;

 }



}
