import java.util.*;
class Vector{
    double x,y,z;
    Vector()
    {
        // default
    }
    Vector(double x,double y,double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println(Math.sqrt((x*x + y*y + z*z)));
    }
    void add(Vector v1, Vector v2)
    {
        System.out.print("Addition of vectors v1 and v2 : ");
        System.out.println((v1.x+v2.x)+"i +"+(v1.y+v2.y)+"j +"+(v1.z+v2.z)+"k ");
    }
    void sub(Vector v1, Vector v2)
    {
        System.out.print("Subtraction of vectors v1 and v2 : ");
        System.out.println((v1.x-v2.x)+"i +("+(v1.y-v2.y)+")j +("+(v1.z-v2.z)+")k ");   
    }


}
public class cc2 {
    public static void main(String[] args) {
        System.out.print("Magnitude of vector v1 : ");
        Vector v1 = new Vector(1,2,3);  // v1 =  1i + 2j + 3k  
        
        System.out.print("Magnitude of vector v2 : ");
        Vector v2 = new Vector(3,3,9);  // v2 =  3i + 3j + 9k

        Vector v = new Vector();
        v.add(v1,v2);
        v.sub(v1,v2);


        
    }
    
}


/*
Magnitude of vector v1 : 3.7416573867739413
Magnitude of vector v2 : 9.9498743710662   
Addition of vectors v1 and v2 : 4.0i +5.0j +12.0k 
Subtraction of vectors v1 and v2 : -2.0i +(-1.0)j +(-6.0)k 
 */