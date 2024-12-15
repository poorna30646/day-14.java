//thread1.setPriority(Thread.MIN_PRIORITY);
class TBA implements Runnable{
    int avt=5;
    public void run()
    {
        String name = Thread.currentThread().getName();
        synchronized(this)
        {
            System.out.println(name+" in proccesing...!to book ticket!");
            if(avt>0)
            {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e)
                {
                    System.out.println(name+" "+e);
                }
                avt--;
                System.out.println(name+" Your ticket was booked susessfully!");
            }else{
                System.out.println(name+" sorry there are no more tickets....! ");
            }
        }
    }
}
class fire{
    public static void main(String args[])
    {
        TBA g = new TBA();
        Thread t1 = new Thread(g,"Amar");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(g,"Satheesh");
        Thread t3 = new Thread(g,"Akash");
        t3.setPriority(Thread.MAX_PRIORITY);
        Thread t4 = new Thread(g,"vivek");
        Thread t5 = new Thread(g,"Allu");
        t5.setPriority(Thread.MAX_PRIORITY);
        Thread t6 = new Thread(g,"Arjun");
        Thread t7 = new Thread(g,"ram");
    }
}
