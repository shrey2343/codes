class Patternloop3{
    public static void main (String args[]){
        int i,j;
        int n=1;
        for(i=1;i<=4;i++){
            for (j=1;j<=i;j++){
                System.out.print((n));
                n++;
            }
            System.out.println();
        }
    }
}/*1
23
456
78910*/