package Lib;
public class User {
    private int User_ID;
    private String name;
    private Card card;

    public User(){}
    public User(int iD_user, String name) {
        setID_user(iD_user);
        setName(name);
    }
    public User(int user_ID, String name, Card card) {
        User_ID = user_ID;
        this.name = name;
        this.card = card;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID_user() {
        return User_ID;
    }
    public void setID_user(int iD_user) {
        this.User_ID = iD_user;
    }
    public Card getCard(){
        return card;
    }
    public void setCard(Card card){
        this.card = card;
    }
    
    public void rut_Tien(int tienRut){
        if (card.getSoDuTK() >= tienRut){
            System.out.printf("Ban da rut $%d.\n", tienRut);
            card.setSoDuTK(card.getSoDuTK() - tienRut);// soDuTK = soDuTK - tienRut
            System.out.printf("So du TK cua ban con $%d.\n", card.getSoDuTK());
            return;
        }
        System.out.println("Khong the rut! Tai khoan khong du tien.");
    }
    public void nap_Tien(int tienNap){
        System.out.printf("Ban da nap $%d.\n", tienNap);
        card.setSoDuTK(card.getSoDuTK() + tienNap);
        System.out.printf("So du TK cua ban con $%d.\n", card.getSoDuTK());
    }
    public void print(){
        System.out.printf("User ID: %d\nTen User: %s\n", User_ID, name);
        card.print();
    }
}
