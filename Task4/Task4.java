package Laboratorka3.Task4;

public class Task4 {

    public static void main(String[] args) {
        final SomeThingRunnable someThingRunnable = new SomeThingRunnable();
        final Thread threadForRunnable = new Thread(someThingRunnable);
        final SomeThingThread someThingThread = new SomeThingThread();
        System.out.println(".....\n");
        threadForRunnable.start();
        someThingThread.start();
        //System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 5; i++)
        {
            try{
                Thread.sleep(1000);		//Приостанавливает поток на 1 секунду
            }catch(InterruptedException e){}

            System.out.println(i+3);
        }

        Object object = new Object();
    }

}
