package vampire;

public class Vampire {
    public static void main(String[] args) {
        int vampireNumber=1000;
        for(int i=0;i<100;)
        {
            if(isVampire(vampireNumber))
            {
                System.out.println(vampireNumber);
                i++;
            }
            vampireNumber++;
        }
    }

    private static boolean isVampire(int vampireNumber) {
        String vampireString=""+vampireNumber;
        int vampireStringLength=vampireString.length();
        allPermutations(vampireString,0,vampireStringLength-1);
        return false;
    }

    private static void allPermutations(String vampireString, int l, int r) {
        if (l == r)
            System.out.println(vampireString);
        else
        {
            for (int i = l; i <= r; i++)
            {
                vampireString = swap(vampireString,l,i);                 
                allPermutations(vampireString, l+1, r);
                vampireString = swap(vampireString,l,i);
            }
        }

    }

    private static String swap(String vampireString, int i, int j) {
        char temp;
        char[] charArray = vampireString.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static boolean isVampireLengthEven(int vampireStringLength) {
        if(vampireStringLength%2==0)
            return true;
        return false;
    }
}
