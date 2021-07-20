package Lib;
public class Card{
//Attributes
    private int soThe;
    private String chuThe;
    private DateM ngayDK;
    private String loaiThe;
    private int soDuTK;
// Constructor
    public Card(){}
    public Card(int soThe, String chuThe){
        setSoThe(soThe);
        setChuThe(chuThe);
    }
    public Card(int soThe, String chuThe, DateM ngayDK, String loaiThe, int soDuTK) {
        setSoThe(soThe);
        setChuThe(chuThe);
        setNgayDK(ngayDK);
        setLoaiThe(loaiThe);
        setSoDuTK(soDuTK);
    }
// Getter Setter
    public int getSoThe() {
        return soThe;
    }
    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }
    public String getChuThe() {
        return chuThe;
    }
    public void setChuThe(String chuThe) {
        this.chuThe = chuThe;
    }
    public DateM getNgayDK() {
        return ngayDK;
    }
    public void setNgayDK(DateM ngayDK) {
        this.ngayDK = ngayDK;
    }
    public String getLoaiThe() {
        return loaiThe;
    }
    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }
    public int getSoDuTK() {
        return soDuTK;
    }
    public void setSoDuTK(int soDuTK) {
        this.soDuTK = soDuTK;
    }
//print
    public void print(){
        System.out.printf("%d %s %d/%d/%d %s $%d\n", soThe, chuThe, 
                            ngayDK.getDay(), ngayDK.getMonth(), ngayDK.getYear(),
                            loaiThe, soDuTK);
    }
}