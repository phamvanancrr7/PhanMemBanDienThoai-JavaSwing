package Model;


public class MauSac {
    private int id;
    private String ma;
    private String mau;

    public MauSac() {
    }

    public MauSac(int id, String ma, String mau) {
        this.id = id;
        this.ma = ma;
        this.mau = mau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
    
}
