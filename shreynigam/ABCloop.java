class ABCloop {
    public static void main (String args[]){
        int i,j;
        for(i=74;i>=65;i-=2){
            for (j=65;j<=i;j+=2){
                System.out.print((char)(j));
            }
            System.out.println();
        }
    }
}/*
ACEGI
ACEG
ACE
AC
A*/