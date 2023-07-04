package ViewModel;


public class QLLoai {
    private String ma;
    private String tenLoai;

    public QLLoai() {
    }

    public QLLoai(String ma, String tenLoai) {
        this.ma = ma;
        this.tenLoai = tenLoai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    
}
