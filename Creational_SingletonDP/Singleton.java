// -----------------for synchronized-------------------

// class abc{
//     public static abc obj;
//     private abc(){
//         System.out.println("Hello...New Instance Created");
//     }
//     public static abc getInstance(){
//         if(obj == null){
//             synchronized (abc.class){
//                 if(obj==null){
//                     obj = new abc();
//                 }
//             }
//         }
//         return obj;
//     }
// }


// ------------for enum-------------

enum abc{
    Instance;
    private abc(){
        System.out.println("abc instantiated");
    }

    int i; 
    public void show(){
        System.out.println(i);
    }
}

public class Singleton{
    public static void main(String[] args){

    // -----------------for synchronized-------------------

    //     Thread t1 = new Thread(new Runnable(){
    //         public void run(){
    //             abc obj = abc.getInstance();
    //         }
    //     });
    //     Thread t2 = new Thread(new Runnable(){
    //         public void run(){
    //             abc obj = abc.getInstance();
    //         }
    //     });
    //     t1.start();
    //     t2.start();
    //     // abc obj1 = abc.getInstance();
    //     // abc obj = abc.getInstance();


    // ------------for enum-------------

        abc obj1 = abc.Instance;
        obj1.i = 5;
        obj1.show();

        abc obj2 = abc.Instance;
        obj2.i = 6;
        obj1.show();
    }
}