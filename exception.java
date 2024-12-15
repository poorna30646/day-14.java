//using try catch blocks in threads
class fire{
    public static void main(String args[])
    {
        System.out.println("thread started....!");
        try{
            Thread.sleep(500);
        }catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Thread resumed....!");
    }
}