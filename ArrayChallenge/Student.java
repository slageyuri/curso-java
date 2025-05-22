package ArrayChallenge;

public class Student {
    public String rent;
    public String name;
    public String email;
    public int room;

    public Student(String name, String email){
        this.name=name;
        this.email=email;
    }

    public String  setRent(String rent) {
        this.rent = rent;
        return this.rent;
    }
    public int setRoom(int room){
        this.room=room;
        return room;
    }
    public String toString(){
        return "Rent: " + rent + "\nName: "+name + "\nEmail: " + email + "\nRoom: "+room;
    }
}
