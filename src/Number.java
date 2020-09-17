public class Number {
    private int x;
    private boolean rimFlag;

    Number (int x){
        this.x = x;
        this.rimFlag = false;
    }

    public int getX() {
        return x;
    }

    public void setRimFlag(boolean rimFlag) {
        this.rimFlag = rimFlag;
    }

    public boolean isRimFlag() {
        return rimFlag;
    }
}
