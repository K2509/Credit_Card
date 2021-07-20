package Lib;
import java.util.*;

public class Manager {
    private Scanner sc = new Scanner(System.in);
    // Attributes
    private int ID;
    private String name;
    //Contructor
    public Manager() {}
    public Manager(int iD, String name) {
        setID(iD);
        setName(name);
    }
    //Getter Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public void print(){
        System.out.printf("%d. %s", ID, name);
    }

    //works of manager
    public User tao_User(){
        System.out.print("Nhap ten User: ");
            String name = sc.nextLine();
        System.out.print("Nhap ID: ");
            int ID = sc.nextInt();
        return new User(ID, name);
    }

    public void tao_The(User a){
        //System.out.print("Nhap chu the: ");
        //    String soThe = sc.nextLine();
        System.out.print("Nhap so the: ");
            int soThe = sc.nextInt();
        System.out.print("Nhap ngay DK: ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt(); sc.nextLine();
            DateM ngayDK = new DateM(day, month, year);
        System.out.print("Nhap loai the: ");
            String loaiThe = sc.nextLine();
        System.out.print("Nhap so du TK: ");
            int soDuTK = sc.nextInt(); sc.nextLine();

        a.setCard(new Card(soThe, a.getName(), ngayDK, loaiThe, soDuTK));
    }
}
