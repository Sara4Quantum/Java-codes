
public class Phase1{
int n=5;
public static void main(String [] args){

Phase1 ph= new Phase1();

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

}


public void print1(){

for(int row=1;row<=n;row++){

    for(int col=1;col<=n;col++){

        System.out.print("* ");
        }

System.out.println();

}


}


public void print2(){

for(int row=1;row<=n;row++){

    for(int col=1;col<=row;col++){

        System.out.print("* ");
     }

System.out.println();

}


}

public void print3(){

for(int row=1;row<=n;row++){

    for(int col=1;col<=row;col++){

        System.out.print(col+" ");
     }

System.out.println();

}


}

public void print4(){

for(int row=1;row<=n;row++){

    for(int col=1;col<=row;col++){

        System.out.print(row+" ");
     }

System.out.println();

}


}


public void print5(){

    for(int row=1;row<=n;row++){

    for(int col=1;col<=row;col++){

    System.out.print(row*col+" ");

    }
System.out.println();
}



}

public void print6(){

    for(int row=1;row<=n;row++){

        for(int col=1;col<=row;col++){

         System.out.print(row+col-1 +" ");

    }
System.out.println();
}



}

public void print7(){

for(int row=1;row<=n;row++){

    for(int col=1;col< row;col++){

        System.out.print( col +" ");

}
System.out.print ("* ");
System.out.println();
}



}

public void print8(){

for(int row=1;row<=n;row++){

    for(int col=1;col< row;col++){

        System.out.print( col +" ");      

}
for(int i=1;i<=3;i++){
    System.out.print ("* ");}

System.out.println();

}



}

public void print9(){
int n=5;
for(int row=1;row<=n;row++){

    for(int col=1;col< row;col++){

        System.out.print( col +" ");

}

for(int i=1;i<=(n+1)-row;i++){
    System.out.print ("* ");
 }

System.out.println();
}



}

public void print10(){

for(int row=1;row<=n;row++){

    for(int col=1;col<=n-row+1;col++){

        System.out.print("* ");
     }

System.out.println();

}


}


public void print11(){

for(int row=1;row<=n;row++){

    for(int col=1;col<=n-row+1;col++){

        System.out.print(col+" ");
     }

System.out.println();

}


}

}
