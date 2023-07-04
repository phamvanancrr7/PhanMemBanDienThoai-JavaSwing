package ViewModel;


public class QLPIN {
    private String maPIN;
    private String dungLuong;

    public QLPIN() {
    }

    public QLPIN(String maPIN, String dungLuong) {
        this.maPIN = maPIN;
        this.dungLuong = dungLuong;
    }

    public String getMaPIN() {
        return maPIN;
    }

    public void setMaPIN(String maPIN) {
        this.maPIN = maPIN;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

   
}
