class Patternloop13{
    public static void main(String args[]){
        int i,j,k;
        for(i=1;i<=5;i++){
            for(j=i;j<=4;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
}