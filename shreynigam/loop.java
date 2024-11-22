class Loop{
    public static void main (String args[]){
        int i,j;
        for( i=1;i<=5;i++){
            for(j=69;j>=i;j--){
                System.out.print((char) (j));
            }
        }
    }
}