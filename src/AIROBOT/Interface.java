package AIROBOT;

interface IronMan{
	public final double jumpDirection=8;
	abstract void jump();
}

interface AmeCap{
	public final int SHIELD=200;
	public abstract void shield();
}

interface GreenGiant{
	public final int TRIGGER=100;
	public abstract void fight();
}

interface BatMan{
	public final int flyAngle = 150;
	public abstract void nightFly();
}