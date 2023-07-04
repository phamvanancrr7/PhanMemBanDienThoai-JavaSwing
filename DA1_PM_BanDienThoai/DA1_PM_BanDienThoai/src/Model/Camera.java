package Model;


public class Camera {
    private int id;
    private String ma;
    private String cam;

    public Camera() {
    }

    public Camera(int id, String ma, String cam) {
        this.id = id;
        this.ma = ma;
        this.cam = cam;
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

    public String getCam() {
        return cam;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }
    
    
}
