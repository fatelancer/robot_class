package Class_1;

import sun.plugin2.message.JavaObjectOpMessage;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
public class Robot {
    private String r_id;
    private int speed;
    private double temp;

    public void input(String i, int s, double t){
        r_id = i;
        speed = s;
        temp = t;
    }

    public void judge(){
        if (temp>1000){
            System.out.println("快跑！火山要爆发了");
            speed = 400;
        }else{
            System.out.println("火山温度正常，继续巡逻！");
            speed = 40;
        }
    }

    public void output(){
        JOptionPane.showMessageDialog(null,//父容器
                "r_id = "+r_id+"\n"+"speed = "+speed +"\n" + "temp = "+temp+"\n",
                "火山探测机器人信息",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main (String [] args){// 命令行运行输入的参数
        Robot r1 = new Robot();
        r1.input("r001", 20, 880);
        r1.judge();
        r1.output();
    }
}
