package Model;

public class PhanLoai {

    private int id;
    private String maPL;
    private String tenPL;

    public PhanLoai() {
    }

    public PhanLoai(int id, String maPL, String tenPL) {
        this.id = id;
        this.maPL = maPL;
        this.tenPL = tenPL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaPL() {
        return maPL;
    }

    public void setMaPL(String maPL) {
        this.maPL = maPL;
    }

    public String getTenPL() {
        return tenPL;
    }

    public void setTenPL(String tenPL) {
        this.tenPL = tenPL;
    }

}
