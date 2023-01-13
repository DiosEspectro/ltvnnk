package lr7.n2;

public class SubClassN2 extends SuperClassN2 {
    public int subint;

    SubClassN2(int subintEx, String superstr){
        this.setValue(subintEx, superstr);
    }


    public void setValue(){
        this.subint = 0;
        this.setValue("");
    }

    public void setValue(int valueEx){
        this.subint = valueEx;
    }

    @Override
    public void setValue(String valueEx){
        super.setValue(valueEx);
    }

    public void setValue(int valueIntEx, String valueStrEx){
        this.subint = valueIntEx;
        this.setValue(valueStrEx);
    }
}