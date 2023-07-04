package Model;


public class PIN {
    private int id;
    private String maPin;
    private String dungLuong;

    public PIN() {
    }

    public PIN(int id, String maPin, String dungLuong) {
        this.id = id;
        this.maPin = maPin;
        this.dungLuong = dungLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaPin() {
        return maPin;
    }

    public void setMaPin(String maPin) {
        this.maPin = maPin;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }
    
    
}
