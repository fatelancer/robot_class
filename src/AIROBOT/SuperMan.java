package AIROBOT;

/**
 * Created by fatel on 2016/5/8.
 */
abstract class SuperMan {
    protected String id="Klark";
    protected int superAbility=10;

    public void SetID(String i){
        id = i;
    }

    public void SetSA(int s){
        superAbility = s;
    }

    abstract String judge();

    public String putID(){
        return id;
    }

    public String putSA(){
        return Integer.toString(superAbility);
    }
}
