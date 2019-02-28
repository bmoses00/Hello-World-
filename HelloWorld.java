public class HelloWorld {
    public static void main(String[] args) {
    	if (Math.random() < .5) {
    		System.out.println("I do not say hello");
    	}
    	else {
		    try {
		        System.out.println("Hello, " + args[0] + "!");
		    }
		    catch (Exception e){
		        System.out.println("Hello World!");
		    }
        }
    }
}
