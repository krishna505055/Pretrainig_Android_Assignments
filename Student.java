public class Student {

   private String program;
   private int year;
   private double fee;
   private String name;
   private String address;

   public Student(String name, String address,String program,int year,double fee) 
   {
       this.name = name;
       this.address = address;
	   this.program = program;
	   this.year = year;
	   this.fee = fee;
       
   }

   public String getProgram() {
       return program;
   }

   public void setProgram(String program) {
       this.program = program;
   }

   public int getYear() {
       return year;
   }

   public void setYear(int year) {
       this.year = year;
   }
   public double getFee() {
       return fee;
   }

   public void setFee(int fee) {
       this.fee = fee;
   }

  
   @Override
   public String toString() {
       String ret = getClass() + " Student's Program: "
               + this.program;
       return ret;
   }

}
