public class Shop{
    public static void main(String args[]){
        //Phone p=new Phone("Android", 16, "Qualcom", 3100);
        Phone p = new PhoneBuilder().setOs("Android").setBattery(2500).getPhone();
        System.out.println(p);
    }
}
