package temp;



public class temp {
	int i[]={0};
    public static void main(String args[]) {
        int i[]={1};
        change_i(i);
        System.out.println("the value is:"+i[0]);
System.out.println(i);
       
    }
    public static void change_i(int i[]) {
          System.out.println("the value i is:"+i[0]);
        int j[]={2};
         System.out.println("the value j is:"+j[0]);
        i=j;
         System.out.println("the value i is after:"+i[0]);
    }
}

