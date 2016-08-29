public class Staff {

   private String school;
   private double pay;
   private String name;
   private String address;

   public Staff(String school, double pay,String name,String address) 
   {
       this.school = school;
       this.pay = pay;
	   this.name = name;
	   this.address = address;
	          
   }

   public String getSchool() {
       return school;
   }

   public void setSchool(String school) {
       this.school = school;
   }

   public double getPay() {
       return pay;
   }

   public void setPay(double pay) {
       this.pay = pay;
   }

  
   @Override
   public String toString() {
       String ret = getClass() + " Staff's Program: "
               + this.school;
       return ret;
   }

}
