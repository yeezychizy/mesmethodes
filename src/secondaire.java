public class secondaire {
    public static int plusPetit(int [] a)
    {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min)
                min = a[i];

        }
        return min;
    }

    public int plusGrand(int [] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i]>max)
                max = a[i];

        return max;
    }

}

