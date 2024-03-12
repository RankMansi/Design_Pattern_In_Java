// package book;

public class Book{
    private int bid;
    private String bname;
    public int getBid(){
        return bid;
    }
    public void setBid(int bid){
        this.bid= bid;
    }
    public String getBname(){
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public String toString(){
        return "Book [bid=" + bid + "bname=" + bname + "]";
    }
}
