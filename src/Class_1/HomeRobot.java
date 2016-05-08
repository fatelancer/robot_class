package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
 class HomeRobot extends Robot{
    private int skill_count;
    protected String r_id;
    protected int speed;
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

