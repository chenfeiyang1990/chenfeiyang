public class OneDay {
	private static final int BREAKFASET = 0;
	private static final int LUNCH = 1;
	private static final int SUPPER = 2;
	public static void main(String[] args) {
		OneDay one = new OneDay();
		one.new_day();
		one.have_meal(BREAKFASET);
		one.goto_work();
		one.code();
		one.have_meal(LUNCH);
		one.code();
		one.return_home();
		one.have_meal(SUPPER);
		one.sleep();
	}

	private void new_day() {
		// TODO Auto-generated method stub
		System.out.println("Today is newday! Come on! ");
	}

	private void have_meal(int meal) {
		// TODO Auto-generated method stub
		switch(meal){
		   case 0:
		       System.out.println("Have breakfaset at 8 a.m !");
		       break;
		   case 1:
		       System.out.println("Have lunch at 12 p.m ");
	           break;
		   case 2:
		       System.out.println("Have supper at 6 p.m ");
	           break;
	       default:
	           System.out.println("                      ");
	            break;
	            }
		    
	}

	private void return_home() {
		// TODO Auto-generated method stub
		System.out.println("go to home at 6 p.m !");
	}

	private void code() {
		// TODO Auto-generated method stub
		System.out.println( "Writing Code !");
	}

	private void goto_work() {
		// TODO Auto-generated method stub
		System.out.println("go to work at 7 a.m!");
	}

	private void sleep() {
		// TODO Auto-generated method stub
		System.out.println("go to sleep at 9 p.m!");
		
	}
}
