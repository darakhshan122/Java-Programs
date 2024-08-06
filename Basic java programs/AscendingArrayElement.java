class AscendingArrayElement{
    public static void main(String[] args) {
        int temp;
        int a[]={45,12,56,8,66,84};
        System.out.println("element of the array is:");
        //for each loop for printing array elements 
        for(int x:a)
        {System.out.print(x+" ");}
        // loop for arranging elements in ascending order
        for(int i=0;i<a.length;i++)
        {for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //loop for printing element of array after arranging in ascending order
        System.out.println("\nelement of the array in ascending order:");
        for(int x:a)
        { System.out.print(x+" ");}
    }
}