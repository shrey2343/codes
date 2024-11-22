class Patternloop5{
    public static void main(String args[]){
        int i,j,k;
        for(i=65;i<=69;i++){
            for(j=i;j<=68;j++){
            System.out.print(" ");
            }
            for(k=65;k<=i;k++){
            System.out.print((char)(k));
            }
            System.out.println();
        
    }
}
}/* A
   AB
  ABC
 ABCD
ABCDE*/