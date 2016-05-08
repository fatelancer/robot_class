package AIROBOT;


public class Mainprog {
	public static void main(String [] args){
		AIRobot ai = new AIRobot();
		ai.setThink(12);
		
		ai.thinkof();
		ai.putThink();
		
		BatMan bm;
		bm = ai;
		bm.nightFly();
		
		IronMan im;
		im = ai;
		im.jump();
		
		GreenGiant gg;
		gg = ai;
		gg.fight();
		
		Robot r;
		r = ai;
		r.war();
		
		SuperMan sp;
		sp = ai;
		System.out.println(sp.judge());
		
		AmeCap ac=ai;
		ac.shield();
	}

}
