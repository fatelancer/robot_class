package Program;

public class SuperRobot implements HomeRobot,WarRobot,MusicRobot{
	private String id;
	private int SuperAbility;
	
	public SuperRobot(String i,int s){
		id=i;
		SuperAbility=s;
	}
	
	public void judge(){
		if (SuperAbility>120){
			System.out.println("您太厉害了");
		}
		else{
			System.out.println("您还需要继续修炼");
		}
	}

	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("I can cook!");
	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I can walk!");
	}

	public void war() {
		// TODO Auto-generated method stub
		System.out.println("I can war!");
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I can play instruments!");
	}
	
	public void output(){
		System.out.println("id="+id+"\nSuperAbility="+SuperAbility);
	}
}
