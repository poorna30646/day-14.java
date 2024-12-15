//implementing runnable interface
class a implements Runnable{
    public void run()
    {
        System.out.println("hello iam thread!");
    }
}
class fire
{
    public static void main(String args[])
    {
        a r=new a();
        Thread s=new Thread();
        s.start();
    r.run();
    }
}
