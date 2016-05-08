package Class_1;


import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */


public class MainProg{

    public static void main (String [] args){// 命令行运行输入的参数
        Robot r1 = new Robot();
        //r1.judge();
        r1.output();

        WarRobot wr = new WarRobot();
        wr.output();

        HomeRobot hr = new HomeRobot();
        hr.output();
    }
}

