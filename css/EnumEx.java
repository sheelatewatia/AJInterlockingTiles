enum Days{
      MON("'Monday"),TUE("Tuesday"),WED("Wednesday"),THU("Thursday"),FRI("Friday"),SAT("Saturday"),Sun("Sunday");
	  
	  private String value;
	  Days(String value)
	  {
		  this.value=value;
	  }
	  String getValue()
	  {
		  return value;
	  }
	  
}
class EnumEx{

       public static void main(String args[])
	   
	   
	   Days d1 = Days.TUE;
	   
	   System.out.println("the name of enum is "+d1.name());
	   System.out.println("the value of the enum is"+d1.getValue())
	   
	   for(Days day: Days.values())
	   {
		    System.out.println("the value of the enum is "+Days.getValue);
	   }
	   

}