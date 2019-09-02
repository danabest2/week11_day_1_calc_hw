public class Calculator {
   private String name;
   private double firstnumber;
   private double secondnumber;

   public Calculator(String name, double firstnumber, double secondnumber){
       this.name = name;
       this.firstnumber = firstnumber;
       this.secondnumber = secondnumber;
   }

   public String getName(){
       return this.name;
   }

   public double getFirstnumber(){
       return this.firstnumber;
   }

   public double getSecondnumber(){
       return this.secondnumber;
   }

   public double getAdd(){
       return this.firstnumber + this.secondnumber;
   }

   public double getSubstract(){
       return this.firstnumber - this.secondnumber;
   }
}








//Add, Subtract, Multiply and Divide