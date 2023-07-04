package ViewModel;


public class QLManHinh {
    private String ma;
    private float kichThuoc;

    public QLManHinh() {
    }

    public QLManHinh(String ma, float kichThuoc) {
        this.ma = ma;
        this.kichThuoc = kichThuoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public float getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(float kichThuoc) {
        this.kichThuoc = kichThuoc;
    }
    
    
}
