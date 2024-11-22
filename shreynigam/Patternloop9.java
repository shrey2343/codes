class Patternloop9{
    public static void main(String args[]){
        int i,j,k,l,m,n;
        for(i=1;i<=5;i++){
            for(j=i;j<=4;j++){
            System.out.print(" ");
            }
            for(k=1;k<=i;k++){
            System.out.print(("*"));
            }
            System.out.println();
        
    }
        for(l=1;l<=4;l++){
            for(m=1;m<=l;m++){
            System.out.print(" ");
            }
            for(n=4;n>=l;n--){
            System.out.print(("*"));
            }
            System.out.println();
        
    }
}
}


