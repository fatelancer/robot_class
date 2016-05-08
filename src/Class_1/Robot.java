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
