import java.util.*;
public class Phase2{
 
public static void main(String []args){

// i will beleive, my patterns printing codes help you to build the better logical thinking..
Phase2 pa = new  Phase2();

pa.printSquare();
 System.out.println();
pa.printA();
System.out.println();// These Empty Print statement is just for extra space to better printing by calling...

 pa.printB(); 
System.out.println();

 pa.printC();
System.out.println();

 pa.printD();
System.out.println();

 pa.printE();
System.out.println();

 pa.printF();
System.out.println();

 pa.printG();
System.out.println();

 pa.printH();
System.out.println();

 pa.printI();
System.out.println();

 pa.printJ();
System.out.println();

 pa.printK();
System.out.println();

 pa.printL();
System.out.println();

 pa.printM();
System.out.println();

 pa.printN();
System.out.println();

 pa.printO();
System.out.println();

 pa.printP();
System.out.println();

 pa.printQ();
System.out.println();

 pa.printR();
System.out.println();

 pa.printS();
System.out.println();

 pa.printT();
System.out.println();

 pa.printU();
System.out.println();

 pa.printV();
System.out.println();

 pa.printW();
System.out.println();

 pa.printX();
System.out.println();

 pa.printY();
System.out.println();

 pa.printZ();

 
 

}

 public void printSquare(){

  for(int row=1;row<=7;row++){
      for(int col=1;col<=7;col++){
       if(row==1 || row==7 || col==1 || col==7){
        System.out.print("* ");
       }
       else System.out.print("  ");
      }
   System.out.println();
   
  }
  
 }
 
public void printA(){
/*
                     
          *           
        *   *         
      *       *       
    * * * * * * *     
  *               *   
*                   * 

*/

for(int row=1;row<=10;row++){
for(int col=1;col<=11;col++){

    if((row>=3) && (row+col==9 || col-row==3))
    System.out.print("* ");
        else if(row==6 &&col>3&& col<9)
            System.out.print("* ");
                else
                    System.out.print("  ");
    }
    System.out.println();
    }

System.out.println();

}
 

public void printB(){

/*

* * * * * *   
*           * 
*           * 
*           * 
*           * 
*           * 
*           * 
* * * * * *   
*           * 
*           * 
*           * 
*           * 
*           * 
* * * * * *   

*/

for(int row=1;row<=7;row++){
for(int col=1;col<=7;col++){

    if((row==1 && col!=7)||(col==1||(col==7&&row!=1)))
    System.out.print("* ");
    else
    System.out.print("  ");
    }
    System.out.println();
    }

printD();
}


public void printC(){
/*

      * * * * * * 
    *             
    *             
    *             
    *             
    *             
      * * * * * * 

*/

for(int row=1;row<=7;row++){
for(int col=1;col<=7;col++){

    if((row==1&& col!=1)  || (row==7&& col!=1))
    System.out.print("* ");
    else if(  row!=1&& row!=7&& col==1)
    System.out.print("* ");
    else
    System.out.print("  ");
    }
System.out.println();
}

}


public static void printD(){

/*

    * * * * * *   
    *           * 
    *           * 
    *           * 
    *           * 
    *           * 
    * * * * * *  

*/

for(int row=1;row<=7;row++){

for(int col=1;col<=7;col++){

    if( ((row==1 && col!=7) || (row==7&& col!=7)) || ((col==7 ) &&(row!=1 && row!=7))){

    System.out.print("* ");
    }
    else if(col==1)
    System.out.print("* ");
    else
        System.out.print("  ");

}
System.out.println();

}


}

public void printE(){

/*

    * * * * * * * 
    *             
    *             
    * * * * * * * 
    *             
    *             
    * * * * * * * 

*/

for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if(row==1 || row==7 || row==4 || col==1)
    System.out.print("* ");
    else
    System.out.print("  ");
}
System.out.println();
}



}




public void printF(){

/*

    * * * * * * * 
    *             
    *             
    * * * * * * * 
    *             
    *             
    *

*/

for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if(row==1  || row==4 || col==1)
    System.out.print("* ");
    else
    System.out.print("  ");
    }
System.out.println();
}
}

public void printG(){

/*
        * * *     
      *       *   
    *            
    *             
    *     * * * * 
    *           * 
      *       *   
        * * *     
*/

for(int row=1;row<=8;row++){
for(int col=1;col<=7;col++){

if( (row==1||row==8)&&(col>2 && col<6) || ((row==2 || row==7)&&(col==2|| col==6)))
    System.out.print("* ");

    else if((row==3 && (col==1)) ||(row==4 && col==1))
         System.out.print("* ");

            else if((row==5 && (col!=2 && col!=3)))
                    System.out.print("* ");

                        else if((row==6 && (col==1 || col==7)))
                        System.out.print("* ");

                            else
                            System.out.print("  ");
}
System.out.println();
}
}




public void printH(){

/*

    *           * 
    *           * 
    *           * 
    * * * * * * * 
    *           * 
    *           * 
    *           * 

*/

for(int row=1;row<=7;row++){

    for(int col=1;col<=7;col++){

        if(col==1 || col==7 || row==4 )
            System.out.print("* ");

        else
           System.out.print("  ");
        }
System.out.println();
}
}



public void printI(){

/*

    * * * * * * * 
          *       
          *       
          *       
          *       
          *       
    * * * * * * * 

*/
for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

        if(row==1 || row==7||col==4){
        System.out.print("* ");
        }
         
        else
        System.out.print("  ");

        }
System.out.println();


}

}


 public void printJ()
{

/*

    * * * * * * * 
          *       
          *       
          *       
          *       
     *    *       
      * * *   
*/

        for(int row=1;row<=7;row++){
        for(int col=1;col<=7;col++){

        if((row==1  ) ||(col==4) ){
        System.out.print("* ");
        }
        else if((row==7&&col>1&&col<4)){

        System.out.print("* ");
        }
        else if(row==6 && col==1){
        System.out.print(" *");
        }
        else
        System.out.print("  ");

        }
System.out.println();


}
}



public void printK(){

/*

    *           *         
    *         *           
    *       *             
    *     *               
    *   *                 
    * *                   
    *   *                 
    *     *               
    *       *             
    *         *           
    *           *   

*/

for(int row=1;row<=11;row++){

for(int col=1;col<=11;col++){

    if(col==1 || row+col==8 || row-col==4){

System.out.print("* ");

}
else
System.out.print("  ");

}

System.out.println();}




}

public void printL(){

/*

    *             
    *             
    *             
    *             
    *             
    *             
    * * * * * * * 

*/  

  for(int row=1;row<=7;row++){

    for(int col=1;col<=7;col++){

        if(col==1 || row==7)
        System.out.print("* ");
        else 
        System.out.print("  ");




}System.out.println();

}
}


public void printM(){

/*

    *           * 
    * *       * * 
    *   *   *   * 
    *     *     * 
    *           * 
    *           * 
    *           * 


*/

for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if(col==1 || col==7)
    System.out.print("* ");
    else if(row<=4 && (row==col || row+col==8) )
    System.out.print("* ");
    else
    System.out.print("  ");

    }
    System.out.println();


    }

}



public void printN(){

/*
    *           * 
    * *         * 
    *   *       * 
    *     *     * 
    *       *   * 
    *         * * 
    *           * 

*/

for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if(col==1 || col==7)
    System.out.print("* ");
    else if( row==col  )
    System.out.print("* ");
    else
    System.out.print("  ");

    }
    System.out.println();


}
}


public void printO(){

/*
      * * * * *   
    *           * 
    *           * 
    *           * 
    *           * 
    *           * 
      * * * * *   


*/

for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if( row!=1 && row!=7 & (col==1|| col==7))
    System.out.print("* ");
    else if((row==1||row==7)&&col!=1&& col!=7)
    System.out.print("* ");
    else
    System.out.print("  ");

    }
System.out.println();


}
}


public void printP(){

/*
    * * * * * *   
    *           * 
    *           * 
    *           * 
    *           * 
    *           * 
    * * * * * *   
    *             
    *             
    *             
    *             
    *             
    *             
    *          

*/

printD();
    for(int row=1;row<=7;row++){
        for(int col=1;col<=7;col++){

    if( col==1 )
        System.out.print("* ");

    else
        System.out.print("  ");

    }
System.out.println();


}
}

public void printQ(){

/*
      * * * * *   
    *           * 
    *           * 
    *           * 
    *       *   * 
    *         * * 
      * * * * * * 
                  * 
*/
for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if( row!=1 && row!=7 & (col==1|| col==7))
    System.out.print("* ");
    else if((row==1||row==7)&&col!=1&& col!=7)
    System.out.print("* ");
    else if(row>4 && row==col)
    System.out.print("* ");
    else
    System.out.print("  ");

    }
System.out.println();


}
System.out.println("              * ");
}
  

public void printR(){

/*
    * * * * * *   
    *           * 
    *           * 
    *           * 
    *           * 
    *           * 
    * * * * * *   
    *             
    * *           
    *   *         
    *     *       
    *       *     
    *         *   
    *           * 

*/

printD();
for(int row=1;row<=7;row++){

    for(int col=1;col<=7;col++){

if( col==1 || row==col)
System.out.print("* ");
 

else
System.out.print("  ");

}
System.out.println();


}
}


public void printS(){

/*
      * * * * *   
    *             
    *             
      * * * * *   
                * 
                * 
      * * * * *   


*/

for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if((row==1 || row==4 || row==7) && col!=1 && col!=7)
    System.out.print("* ");
    else if((row==2 || row==3) && col==1) {
    System.out.print("* ");
    }
    else if((row==5 || row==6) && col==7) {
    System.out.print("* ");
    }

    else
    System.out.print("  ");
    }
System.out.println();
}
}

public void printT(){

/*

    * * * * * * * 
          *       
          *       
          *       
          *       
          *       
          *       

*/

for(int row=1;row<=7;row++){
    for(int col=1;col<=7;col++){

    if(row==1|| col==4)
    System.out.print("* ");
    else
    System.out.print("  ");
    }
    System.out.println();
    }
}



public void printU(){

/*
    *           * 
    *           * 
    *           * 
    *           * 
    *           * 
    *           * 
      * * * * *   


*/

    for(int row=1;row<=7;row++){

    for(int col=1;col<=7;col++){

    if(row!=7&&(col==1 || col==7) )
    System.out.print("* ");
    else if((row==7 && col!=1 && col!=7))
    System.out.print("* ");
    else
    System.out.print("  ");
    }
System.out.println();
}
}

public void printV(){
 
/*

    *           * 
      *       *   
        *   *     
          *       
*/

for(int row=1;row<=7;row++){

    for(int col=1;col<=7;col++){

  if(row<=4 && (row==col || row+col==8) )
System.out.print("* ");
else
System.out.print("  ");

}
System.out.println();

}}

  
public void printW(){

/*
    *           * 
    *           * 
    *           * 
    *     *     * 
    *   *   *   * 
    * *       * * 
    *           * 


*/

for(int row=1;row<=7;row++){

     for(int col=1;col<=7;col++){

if((col==1 || col==7)  )
System.out.print("* ");
else if(row>=4 && (row==col || row+col==8))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}




public void printX(){
 
/*
    *           * 
      *       *   
        *   *     
          *       
        *   *     
      *       *   
    *           * 


*/

    for(int row=1;row<=7;row++){

        for(int col=1;col<=7;col++){

          if( (row==col || row+col==8) )
        System.out.print("* ");
        else
        System.out.print("  ");

        }
        System.out.println();

 
}}


public void printY(){

/*
    *           * 
      *       *   
        *   *     
          *       
        *         
      *           
    *           

*/

for(int row=1;row<=7;row++){

    for(int col=1;col<=7;col++){

        if( ((row==col && row<=4) || row+col==8) )
            System.out.print("* ");
        else
            System.out.print("  ");

}
        System.out.println();

}
}


public void printZ(){

/*

    * * * * * * * 
              *   
            *     
          *       
        *         
      *           
    * * * * * * * 

*/

    for(int row=1;row<=7;row++){
        for(int col=1;col<=7;col++){

          if( row==1 || row==7 || row+col==8)
        System.out.print("* ");
        else
        System.out.print("  ");

    }
        System.out.println();


 
}

}



 

 

 



 
  }
