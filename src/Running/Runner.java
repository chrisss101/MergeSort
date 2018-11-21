package Running;
import Methods.Merge;

public class Runner {
    public static void main(String[] args) {
        int[] numArray = new int[9];
        int[] numArray2 = new int[9];
        numArray[0] = 3;
        numArray[1] = 5;
        numArray[2] = 2;
        numArray[3] = 6;
        numArray[4] = 4;
        numArray[5] = 8;
        numArray[6] = 3;
        numArray[7] = 1;
        numArray[8] = 4;

        Merge testNo = new Merge(numArray);
        Merge.mergeSortHelper(numArray,0,8,numArray2);

    }

}
