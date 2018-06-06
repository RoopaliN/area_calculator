/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape_area;

import java.util.Scanner;

/**
 *
 * @author Vivek
 */
public class ThreeDimensionVolume {
    
    static void calcvol_cube(Scanner inp)
    {
        float side,cube_vol;
        System.out.println("Enter the side of the Cube :");
        side = inp.nextFloat();
        cube_vol=(float)(side*side*side);
        System.out.println("The Volume of the cube is : "+cube_vol);
    }
    
    
    static void calcvol_cuboid(Scanner inp)
    {
        float length,width,height,cuboid_vol;
        System.out.println("Enter the Length of the Cuboid");
        length=inp.nextFloat();
        System.out.println("Enter the Width of the Cuboid");
        width=inp.nextFloat();
        System.out.println("Enter the Height of the Cuboid");
        height=inp.nextFloat();
        cuboid_vol=(float)(length*width*height);
        System.out.println("The Volume of Cuboid is : "+cuboid_vol);
    }
    
    static void calcvol_triangular_prism(Scanner inp)
    {
         float base,height,width,basearea,prism_vol;
        System.out.println("Enter the Base of the prism :");
        base=inp.nextFloat();
        System.out.println("Enter the Height of the prism :");
        height=inp.nextFloat();
        System.out.println("Enter the Width of the prism :");
        width=inp.nextFloat();
        basearea=(float)(0.5*base*height);
        prism_vol=(float)(width*basearea);
        System.out.println("The Volume of prism is :"+prism_vol);
    }
    
    static void calcvol_cylinder(Scanner inp)
    {
        float radius,height,cylinder_vol;
        System.out.println("Enter the Radius of the base of cylinder :");
        radius=inp.nextFloat();
        System.out.println("Enter the Height of the cylinder:");
        height=inp.nextFloat();
        cylinder_vol=(float)(3.14159*radius*radius*height);
        System.out.println("The Volume of Cylinder is :"+cylinder_vol);
    }
    
    static void calcvol_cone(Scanner inp)
    {
        float height,radius,cone_vol;
        System.out.println("Enter the Radius of the base of the Cone :");
        radius=inp.nextFloat();
        System.out.println("Enter the height of the Cone :");
        height=inp.nextFloat();
        cone_vol=(float)((1/3)*(3.14159*radius*radius*height));
        System.out.println("The Volume of Cone is :"+cone_vol);
    }
    
     static void calcvol_sphere(Scanner inp)
    {
        float radius,sphere_vol;
        System.out.println("Enter the Radius of the Sphere:");
        radius=inp.nextFloat();
        sphere_vol=(float)((4/3)*(3.14159*radius*radius));
        System.out.println("The Volume of the Sphere is :"+sphere_vol);
    }

    
     static void redirect(Scanner inp)
    {
        int ch;
        System.out.println("What you want to do :");
        System.out.println("1.Go to Main Menu ");
        System.out.println("2.Exit Application");
        ch=inp.nextInt();
        switch(ch)
        {
            case 1:
                Shape_area Shape_area= new Shape_area();
                Shape_area.main(null);
            case 2:
                 System.exit(0);
            default:
                 System.out.println("Invalid Entry");
                 redirect(inp);
                 
        }  
    }
    
    public static void main(String args[])
    {
         int ch;
       Scanner inp=new Scanner(System.in);
       do{
       System.out.println("Select the Shape you want to find the Volume of ");
       System.out.println("1. Cube ");
       System.out.println("2. Cuboid ");
       System.out.println("3. Triangular Prism ");
       System.out.println("4. Cylinder");
       System.out.println("5. Cone");
       System.out.println("6. Sphere");
       System.out.println("7. Exit this menu");
       System.out.println(" Enter your Choice :- ");
       ch=inp.nextInt();
       switch(ch)
       {
           case 1:
               calcvol_cube(inp);
               break;
           case 2:
               calcvol_cuboid(inp);
               break;
           case 3:
               calcvol_triangular_prism(inp);
               break;
           case 4:
               calcvol_cylinder(inp);
               break;
           case 5:
               calcvol_cone(inp);
               break;
           case 6:
               calcvol_sphere(inp);
               break;
           case 7:
                 redirect(inp);
                 break;
           default:
               System.out.println("Invalid Choice! Please Retry");
       }
    
       }while(ch!=7);
       }
}
