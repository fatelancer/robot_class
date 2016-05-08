package AIROBOT;

public class AIRobot extends SuperMan implements GreenGiant,Robot,AmeCap{
	private int think;
	
	public void setThink(int t){
		think=t;
	}
	
	public void fight(){
		System.out.println("变身绿巨人！I can Fight！\n临界愤怒值"+TRIGGER);
	}
	
	public void nightFly(){
		System.out.println("变身蝙蝠侠！I can fly at night!\n飞行角度："+flyAngle);
	}
	
	public void jump(){
		System.out.println("变身钢铁侠！I can jump so high!\n跳跃高度："+jumpDirection);
	}
	
	public void war(){
		System.out.println("进入机器人模式！\n武器种类:"+weapon);
	}
	
	public String judge(){
		return "变身超人！\nID:"+putID()+"\nSuperAbility:"+putSA();
	}
	
	public void shield(){
		System.out.println("变身美国队长！\n盾牌损耗值"+SHIELD);
	}
	public void thinkof(){
		if (think>100)
			System.out.println("我是天才!");
		else
			System.out.println("MDZZ！");
	}
	
	public void putThink(){
		System.out.println("我的智商是"+think);
	}
}
