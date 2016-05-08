package Class_1;

import javax.swing.*;

/**
 * Created by fatel on 2016/5/8.
 */
 class WarRobot extends Robot {
    private int weapon_count;
    private String r_id;
    private int speed;
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
