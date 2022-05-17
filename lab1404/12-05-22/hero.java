package bikes;

public class hero extends bike{

	@Override
	void start() {
		System.out.println("Hero bike is started");
		
	}

	@Override
	void move() {
		
		System.out.println("Hero bike is Moving");
		
	}

	@Override
	void stop() {
		System.out.println("Hero bike is stoped");
		
	}
  
}
