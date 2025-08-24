import java.util.Scanner;
public class distance {
   private float feet;
   private float inch;

public distance(float feet, float inch){
    this.feet = feet;
    this.inch = inch;
}
public distance(){
     this.feet = 0.0f;
    this.inch = 0.0f;
}

public float getFeet() { return feet; }
public float getInch() { return inch; }

public void setFeet(float feet) { this.feet = feet; }
public void setInch(float inch) { this.inch = inch; }

public void sum(distance dist) {
        float totalInches = (this.feet  * 12 + this.inch) +
                            (dist.feet * 12 + dist.inch);
        float resFeet = (int) (totalInches / 12);
        float resInch = totalInches % 12;

        /* v) display result */
        System.out.println("Sum = " + resFeet + " ft " + resInch + " in");
    }


}

