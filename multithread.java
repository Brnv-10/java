public class A extends Thread{
    public void run()
    {
    for(i=1;i<6;i++){
        system.out.printn("brnv");
    }
    system.out.println("exitingg from A");
}
}

public class B extends thread{
    public void run(){
        for(i=1;i<=5;i++){
            system.out.println("+++")

        }
        system.out.println("exit from B");
    }
}

public class ThreadTest{
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}
    

