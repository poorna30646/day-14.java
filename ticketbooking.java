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
        Thread t2 = new Thread(g,"Satheesh");
        Thread t3 = new Thread(g,"Akash");
        Thread t4 = new Thread(g,"vivek");
        Thread t5 = new Thread(g,"Allu");
        Thread t6 = new Thread(g,"Arjun");
        Thread t7 = new Thread(g,"ram");
        Thread t8 = new Thread(g,"charan");
        Thread t9 = new Thread(g,"mega");
        Thread t10 = new Thread(g,"star");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
