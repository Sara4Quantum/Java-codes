public class Phase3{
int n=5;

public static void main(String []args){

Phase3 ph= new Phase3();

ph.print1();
System.out.println();
ph.print2();
System.out.println();
ph.print3();
System.out.println();
ph.print4();
System.out.println();
ph.print5();
System.out.println();
ph.print6();
System.out.println();
ph.print7();
System.out.println();
ph.print8();
System.out.println();
ph.print9();
System.out.println();
ph.print10();
System.out.println();
ph.print11();
System.out.println();
ph.print12();
System.out.println();
ph.print13();
System.out.println();
ph.print14();
System.out.println();
ph.print15();
System.out.println();
ph.print16();
System.out.println();
ph.print17();
}



public void print1(){

for(int row=1;row<=n;row++){

    for(int i=1;i<=n-row;i++){
System.out.print(" ");
    }

    for(int col=1;col<=2*row-1;col++){

        System.out.print("*");
     }

    for(int i=1;i<=n-row;i++){
        System.out.print(" ");
    }
System.out.println();

}


}
 
public void print2(){

for(int row=1;row<=n;row++){

    for(int i=1;i<=row-1;i++){
System.out.print(" ");
    }

    for(int col=1;col<=2*n-(2*row-1);col++){

        System.out.print("*");
     }

  for(int i=1;i<=row-1;i++){
        System.out.print(" ");
    }

System.out.println();

}


}

public void print3(){

print1();
print2();

}

public void print4(){
 
int end=0;
for(int row=1;row<=2*n-1;row++){

    end =row;
         
    if(row>n)
    end=2*n-row;


    for(int col=1;col<=end;col++){

        System.out.print("*");
     }

System.out.println();

}

}


public void print5(){

    for(int row=1;row<=n;row++) {

        for(int col=1;col<=row;col++){

            if((row+col)%2==0){
            System.out.print("1 ");
            }

            else{
            System.out.print("0 ");
                 }

    }

System.out.println();

}

}

public void print6(){

    int n=4;
    int space=2*(n-1);

for(int row=1;row<=n;row++) {

    for(int i=1;i<=row;i++){
    System.out.print(i);

    }
    for(int col=1;col<=space;col++){

        System.out.print(" ");
        }

    for(int i=row;i>=1;i--){
    System.out.print(i);

    }

System.out.println();

space -= 2;
}

}

public void print7(){

int no=1;
    for(int row=1;row<=n;row++){

        for(int col=1;col<=row;col++){

        System.out.print(no+" ");
            no=no+1;
        }
System.out.println();

}



}



public void print8(){

 
    for(int row=1;row<=n;row++){

        for(char col='A';col<'A'+row;col++){

        System.out.print(col );
             
        }
System.out.println();

}

}

public void print9(){

 
    for(int row=1;row<=n;row++){

        for(char col='A';col<='A'+(n-row);col++){

        System.out.print(col );
             
        }
System.out.println();

}

}
public void print10(){

 char ch='A';
    for(int row=0;row<n;row++){

        for(int col=0;col<=row;col++){

        System.out.print(ch );
             
        }
    System.out.println();
ch++;
}
}


public void print11(){

 for(int row=1;row<=n;row++){

        for(int i=1;i<=n-row;i++){
    System.out.print(" ");
        }

    int breakpoint=(2*row-1)/2;
    char ch='A';
        for(int col=1;col<=2*row-1;col++){

            System.out.print(ch);
                if(col<=breakpoint)
                ch++;
                else 
                ch--;
         }

        for(int i=1;i<=n-row;i++){
        System.out.print(" ");
            }
    System.out.println();

}
}

public void print12(){

 char ch='E';
    for(int row=0;row<n;row++){
 
        for( char c=ch ;c<='E';c++){

        System.out.print(c +" ");
              
        }
ch--;
System.out.println();
 
}
}

public void print13(){

int space=0;
 for(int row=0;row<n;row++){

// stars
    for(int col=1;col<=n-row;col++){
        System.out.print("*");
}

    //space
    for(int j=1;j<=space;j++){

    System.out.print(" ");

    }

// stars
 for(int col=1;col<=n-row;col++){
        System.out.print("*");

}

System.out.println();
space+=2;
}
   
 
for(int row=1;row<=n;row++){

    //stars
    for(int i=1;i<=row;i++){
    System.out.print("*");
    }
    
    //space
    for(int j=1;j<=(n*2)-(row*2);j++){ 
    System.out.print(" ");

    }

    //stars
    for(int i=1;i<=row;i++){
    System.out.print("*");
    }
System.out.println();
}


  
}


public void print14(){

    int space=2*n-2;
 for(int row=1;row<=n*2-1;row++){

    int stars=row;
if(row>n)stars=2*n-row;

    //stars
    for(int col=1;col<=stars;col++){

    System.out.print("*");

    }

    //space
    for(int j=1;j<=space;j++){
    System.out.print(" ");

    }


    //stars
    for(int col=1;col<=stars;col++){

    System.out.print("*");

    }

if(row<n)space-=2;
else space+=2;

System.out.println();
}
}

public void print15(){

for(int row=1;row<=n-1;row++){

    for(int col=1;col<=n-1;col++){

        if(row==1 || row==n-1 || col==1 || col==n-1){
        System.out.print("* ");}

            else System.out.print("  ");
}

System.out.println();
}


}



public void print16(){

 int n=3;
    int value=0;
    int i=2;
    int no=0;
for(int row=1;row<=(n*2)-1;row++){

 

if(row>=n) no=2*n-row ; 
 else no=row;

        value = value+no; 
        i=value+1;  
    
for(int col=1;col<=no  ;col++){
      
    System.out.print( --i+" "); 

    }
 
System.out.println();
 
}

}


public void print17(){

    int n=4;
for(int row=0;row<n*2-1;row++ ){

    for(int col=0;col<n*2-1;col++){

        int top=row;
        int left=col;
        int right=(2*n-2)-col;
        int bottom=(2*n-2)-row;

System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right))+" ");

}
System.out.println();

}
}


}
