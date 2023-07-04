package Model;


public class Loai {
    private int id;
    private String maLoai;
    private String tenLoai;

    public Loai() {
    }

    public Loai(int id, String maLoai, String tenLoai) {
        this.id = id;
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    
    
}
