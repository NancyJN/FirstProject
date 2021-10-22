public class First
{
    public static void main(String[] args)
    {
int [] student1 ={11,22,33,44,55};
//int [] student2 ={11,22,33,44,55};
//int [] student3 ={11,22,33,44,55};
//int [] student4 ={11,22,33,44,55};
//int [] student5 ={11,22,33,44,55};

 for (int i = 0 ; i < 5 ; i++)
 {
    // System.out.println(student1[i]);
 }

int students [][]=
{
        //arrays of 4 one d array
        //row index:0
    {11,22,33},
       // row index:1
    {10,12,23},
       // row index:2
    {14,26,38},
        //row index:3
    {61,82,93},
};

 for (int  i=0 ; i<4 ; i++)
 {
     int total =0 ;

     for (int j= 0;j<3 ; j++)
     {
        // System.out.println(students[i][j]);
         total = total + students [i][j];
     }
     System.out.println(total);
 }




    }
}
