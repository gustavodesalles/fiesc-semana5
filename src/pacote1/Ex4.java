package pacote1;

class FinalAttributes {
    private final int FINAL_ATTRIBUTE1_;
    private final static int FINAL_ATTRIBUTE2_;

    static {
        FINAL_ATTRIBUTE2_ = 0;
    }

    FinalAttributes(int final_attribute1_) {
        FINAL_ATTRIBUTE1_ = final_attribute1_;
    }
}

public class Ex4 {

    public static void main(String[] args) {
        new FinalAttributes(23);
    }
}
