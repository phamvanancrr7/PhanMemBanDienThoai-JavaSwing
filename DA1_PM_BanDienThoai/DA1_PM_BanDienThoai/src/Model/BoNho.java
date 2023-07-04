package Model;


public class BoNho {
    private int id;
    private String ma;
    private String rom;
    private String ram;

    public BoNho() {
    }

    public BoNho(int id, String ma, String rom, String ram) {
        this.id = id;
        this.ma = ma;
        this.rom = rom;
        this.ram = ram;
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

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    
    
}
