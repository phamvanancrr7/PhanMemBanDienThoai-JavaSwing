package Model;


public class ManHinh {
    private int id;
    private String ma;
    private float kichThuoc;
    private String loaiMH;

    public ManHinh() {
    }

    public ManHinh(int id, String ma, float kichThuoc, String loaiMH) {
        this.id = id;
        this.ma = ma;
        this.kichThuoc = kichThuoc;
        this.loaiMH = loaiMH;
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

    public float getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(float kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getLoaiMH() {
        return loaiMH;
    }

    public void setLoaiMH(String loaiMH) {
        this.loaiMH = loaiMH;
    }
    
    
}
