# JAVA 第二次课

#封装继承多态


## 1. 父类

```java
package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
class Robot {
    protected String r_id;
    protected int speed;
    //private double temp;

    public Robot(){
        r_id = JOptionPane.showInputDialog(null,
                "r_id = ",
                "请输入ID",
                JOptionPane.QUESTION_MESSAGE
        );
        speed = Integer.parseInt( JOptionPane.showInputDialog(null,
                "speed = ",
                "请输入速度",
                JOptionPane.QUESTION_MESSAGE
        ));
        /*temp = Double.parseDouble(JOptionPane.showInputDialog(null,
                "temp = ",
                "请输入温度",
                JOptionPane.QUESTION_MESSAGE
        ));*/

    }

    public String judge(){
        if (speed>120){
            speed = 115;
            return "您超速了";
        }else{
            //speed = 40;
            return "您的速度正常";
        }
    }

    public void output(){
        JOptionPane.showMessageDialog(null,//父容器
                "r_id = "+r_id+"\n"+"speed = "+speed +"\n" /*+ "temp = "+temp+"\n"*/+ judge() + "\n",
                "机器人信息",
                JOptionPane.INFORMATION_MESSAGE
        );
    }


}

```

## 2. 子类
###2.1 子类1（WarRobot）
```java
package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
 class WarRobot extends Robot {
    private int weapon_count;
    //private String r_id;
    //private int speed;
    //private double temp;

    public WarRobot() {
        super();
        weapon_count = Integer.parseInt(JOptionPane.showInputDialog(null,
                "weapon_count = ",
                "请输入武器数量",
                JOptionPane.QUESTION_MESSAGE
        ));

    }

    public String judge() {
        if (weapon_count > 10) {
            speed = 200;
            return "您是战神";
        } else {
            //speed = 40;
            return "您是菜鸟";
        }
    }

    public void output() {
        JOptionPane.showMessageDialog(null,//父容器
                "r_id = " + r_id + "\n" + "speed = " + speed + "\n" + "weapon_count = " + weapon_count + "\n" + judge() + "\n",
                "战斗机器人信息",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}

```

###2.2 子类2（HomeRobot）
```java
package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
 class HomeRobot extends Robot{
    private int skill_count;
    //protected String r_id;
    //protected int speed;
    //private double temp;

    public HomeRobot(){
        super();
        skill_count = Integer.parseInt(JOptionPane.showInputDialog(null,
                "skill_count = ",
                "请输入技能数",
                JOptionPane.QUESTION_MESSAGE
        ));

    }

    public String judge(){
        if (skill_count>5){
           // speed = 115;
            return "你是家务大师";
        }else{
            //speed = 40;
            return "您是家务菜鸟";
        }
    }

    public void output(){
        super.output();
        JOptionPane.showMessageDialog(null,//父容器
                "skill_count = "+skill_count+"\n"+ judge() + "\n",
                "机器人信息",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}

```

###2.3 UML类图



#抽象类
##1. 父类抽象类

```java
package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
abstract class Robot {
    protected String r_id;
    protected int speed;
    //private double temp;

    public Robot(){
        r_id = JOptionPane.showInputDialog(null,
                "r_id = ",
                "请输入ID",
                JOptionPane.QUESTION_MESSAGE
        );
        speed = Integer.parseInt( JOptionPane.showInputDialog(null,
                "speed = ",
                "请输入速度",
                JOptionPane.QUESTION_MESSAGE
        ));
        /*temp = Double.parseDouble(JOptionPane.showInputDialog(null,
                "temp = ",
                "请输入温度",
                JOptionPane.QUESTION_MESSAGE
        ));*/

    }

    public String judge(){
        if (speed>120){
            speed = 115;
            return "您超速了";
        }else{
            //speed = 40;
            return "您的速度正常";
        }
    }

    public void output(){
        JOptionPane.showMessageDialog(null,//父容器
                "r_id = "+r_id+"\n"+"speed = "+speed +"\n" /*+ "temp = "+temp+"\n"*/+ judge() + "\n",
                "机器人信息",
                JOptionPane.INFORMATION_MESSAGE
        );
    public void abstract run();
    }


}

```

##2.子类
###2.1 子类1
```java
package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
 class WarRobot extends Robot {
    private int weapon_count;
    //private String r_id;
    //private int speed;
    //private double temp;

    public WarRobot() {
        super();
        weapon_count = Integer.parseInt(JOptionPane.showInputDialog(null,
                "weapon_count = ",
                "请输入武器数量",
                JOptionPane.QUESTION_MESSAGE
        ));

    }

    public String judge() {
        if (weapon_count > 10) {
            speed = 200;
            return "您是战神";
        } else {
            //speed = 40;
            return "您是菜鸟";
        }
    }

    public void output() {
        JOptionPane.showMessageDialog(null,//父容器
                "r_id = " + r_id + "\n" + "speed = " + speed + "\n" + "weapon_count = " + weapon_count + "\n" + judge() + "\n",
                "战斗机器人信息",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    public void run(){
		System.out.println("我像风一样的奔跑");
	}
}

```

###2.2 子类2（HomeRobot）
```java
package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
 class HomeRobot extends Robot{
    private int skill_count;
    //protected String r_id;
    //protected int speed;
    //private double temp;

    public HomeRobot(){
        super();
        skill_count = Integer.parseInt(JOptionPane.showInputDialog(null,
                "skill_count = ",
                "请输入技能数",
                JOptionPane.QUESTION_MESSAGE
        ));

    }

    public String judge(){
        if (skill_count>5){
           // speed = 115;
            return "你是家务大师";
        }else{
            //speed = 40;
            return "您是家务菜鸟";
        }
    }

    public void output(){
        super.output();
        JOptionPane.showMessageDialog(null,//父容器
                "skill_count = "+skill_count+"\n"+ judge() + "\n",
                "机器人信息",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    public void run(){
		System.out.println("我像仙女一样在飘");
	}
}

```

##3. 运行程序
```java
package Class_1;


import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */


public class MainProg{

    public static void main (String [] args){// 命令行运行输入的参数
        Robot r1;//为超类Robot新建一个引用

        WarRobot wr = new WarRobot();
        wr.output();

        HomeRobot hr = new HomeRobot();
        hr.output();
		//将超类Robot的引用r1指向子类WarRobot的对象wr
		r1 = wr;
		r1.run();

		r1 = hr;
		r1.run();

		//Robot r1 = new WarRobot();
    }
}

```
#接口
##1. 接口
```java
package Program;

public interface Robot {
	public final int SPEED=100;
	public abstract void walk();
}

```
```java
package Program;

public interface MusicRobot {
	public final int PLAY_KINDS=10;
	public abstract void play();
}

```

```java
package Program;

public interface WarRobot extends Robot{
	public final int WEAPON_COUNT=15;
	public abstract void war();
}

```
```java
package Program;

public interface HomeRobot extends Robot{
	public final int SKILL_COUNT=8;
	public abstract void cook();
}

```
##2. 子类
```java
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

```
##3. 执行程序
```java
package Program;

public class MainProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperRobot r=new SuperRobot("r001",10);
		r.judge();
		r.walk();
		r.war();
		r.cook();
		r.play();
		r.output();
	}

}
```
##4. UML图


