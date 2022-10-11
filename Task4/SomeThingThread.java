package Laboratorka3.Task4;

public class SomeThingThread extends Thread {
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("Maxim");
        }
    }
}
