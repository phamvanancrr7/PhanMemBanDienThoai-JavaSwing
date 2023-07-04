package ViewModel;

public class QLCTSanPham {

    private String id;
    private String tenSP;
    private String loai;
    private String ram;
    private String rom;
    private float manhinh;
    private int soLuong;
    private long giaBan;

    public QLCTSanPham() {
    }

    public QLCTSanPham(String tenSP, String loai, String ram, String rom, float manhinh, int soLuong, long giaBan) {
        this.tenSP = tenSP;
        this.loai = loai;
        this.ram = ram;
        this.rom = rom;
        this.manhinh = manhinh;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public QLCTSanPham(String id, String tenSP, String loai, String ram, String rom, float manhinh, int soLuong, long giaBan) {
        this.id = id;
        this.tenSP = tenSP;
        this.loai = loai;
        this.ram = ram;
        this.rom = rom;
        this.manhinh = manhinh;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public float getManhinh() {
        return manhinh;
    }

    public void setManhinh(float manhinh) {
        this.manhinh = manhinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "QLCTSanPham{" + "tenSP=" + tenSP + ", loai=" + loai + ", ram=" + ram + ", rom=" + rom + ", manhinh=" + manhinh + ", soLuong=" + soLuong + ", giaBan=" + giaBan + '}';
    }

}
