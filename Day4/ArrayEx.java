package Day4;

public class ArrayEx {
    //array is a collection of elements of the
    //same data type stored in continous memory location.
    //  easier to manage large amount of data effciently
    // arrays are fixed size
    //array index starts with 0;
    public static void main(String[] args) {
        //declarotion 
        //int[] num=new int[8];
        // initialization
       int[] num={8,7,3,4,5};
       // using for loop
    //   for(int i=0;i< num.length;i++){
    //     System.out.println(num[i]);
    //    }
       // using for each
       for(int i:num){
        System.out.println(i);
       }
       // single dimentional array
       int[] single={8,7,3,4,5};
       //2d array
       int[][] twodimention= {
            {1,2,3,6,9},
            {2,8,9,0,6}
       };
       //multimentional or 3d
       int[][][] threedimetion={
        {
            {1,2,3,6,9},
            {2,8,9,0,6}
       },
       {
        {1,2,3,6,9},
        {2,8,9,0,6}
     }
       };
       // jagged array
       //2d array where each row can have a diiferent number of 
       //columns
      
       int[][] jagged=new int[3][];
        jagged[0] =new int[]{1,2};
        jagged[1] =new int[]{1,8,9};
        jagged[2] =new int[]{1,8,9,6};


          

    }

}
