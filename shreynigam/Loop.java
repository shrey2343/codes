class Loop{
    public static void main (String args[]){
        int i,j;
        for( i=65;i<=69;i++){
            for(j=69;j>=i;j--){
                System.out.print((char) (j));
            }
            System.out.println();
        }
    }
}