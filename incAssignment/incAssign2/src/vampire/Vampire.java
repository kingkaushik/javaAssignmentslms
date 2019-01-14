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
        String tempVampireString[]=new String[];
        if(isVampireLengthEven(vampireStringLength))
        {
            for(int i=0;i<vampireStringLength;i++) {
                char vampireChar=vampireString.charAt(i);
                if(!((i==0 && vampireChar=='0')||(i==vampireStringLength/2 && vampireChar=='0')))
                    tempVampireString[i] += "" + vampireString.charAt(i);
            }
        }
        return false;
    }

    private static boolean isVampireLengthEven(int vampireStringLength) {
        if(vampireStringLength%2==0)
            return true;
        return false;
    }
}
