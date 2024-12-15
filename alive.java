class fire{
    public static void main(String args[])
    {
        Runnable r= ()->System.out.println("iam new thread");
        Thread t=new Thread();
        t.start();
        System.out.println(t.isAlive());
    }
}