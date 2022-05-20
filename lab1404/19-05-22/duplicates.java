class duplicates{
  static  void duplicate(int []arr)
    {
        int n=arr.length;
        int []abc=new int [n];
        int j,temp;
        int k=0;
         for( int i=0;i<n;i++)
         {
               temp=arr[i];
              for( j=i+1;j<n;j++)
              {
                  if(temp==arr[j])
                  {
                      break;
                  }
                  
              }
              if (j==n)
              {
                  abc[k]=temp;
                  k++;
              }
         }
         int l=abc.length;
         for(int  i=0;i<l;i++)
         {
             System.out.println(abc[i]);
         }
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter size of araay");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        duplicate(arr);
        
    }
}