package Model;

public class NSX {

    private int id;
    private String maNSX;
    private String tenNSX;

    public NSX() {
    }

    public NSX(int id, String maNSX, String tenNSX) {
        this.id = id;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

}
