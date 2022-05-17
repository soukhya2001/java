package bikes;

public class yamaha extends bike{

	@Override
	void start() {
		System.out.println("Yamaha bike is started");
		
	}

	@Override
	void move() {
		System.out.println("Yamaha bike is moving");
		
	}

	@Override
	void stop() {
		System.out.println("Yamaha bike is stoped");
		
	}

}
