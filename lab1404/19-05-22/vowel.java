class vowel {
   static   int vowels(String s)
    {
        String S=s.toLowerCase();
        int n=S.length();
        for(int i=0;i<n;i++)
        {
            if(S.charAt(i)=='a'|| S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String []abc=s.split(" ");
         int count=0;
         int n=abc.length;
         for(int i=0;i<n;i++)
         {
            if (vowels(abc[i])==1)
            {
                count=count+1;
            }
         }
         System.out.println(count);
        
    }
}