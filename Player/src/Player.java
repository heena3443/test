
class Base {
	public Base() {
		super();
		System.out.println("Hello I am in Base");
		// TODO Auto-generated constructor stub
	}
	public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
	
    public Derived() {
    	
    	System.out.println("I am in Derived");
    	
		// TODO Auto-generated constructor stub
	}

	public void show() {
       System.out.println("Derived::show() called");
    }
}
  
class Player {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.show();
    }
}

