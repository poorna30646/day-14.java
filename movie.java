class a implements Runnable{
    public void run()
    {
        System.out.println("counter opened...!");
    }
}
class b implements Runnable{
    public void run()
    {
        try{
            System.out.println("1 st ticket was booked..!");
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            System.out.println("is inturrupted");
        }
    }
}
class c implements Runnable{
    public void run()
    {
        try{
            System.out.println("2 nd ticket was booked..!");
            Thread.sleep(200);
        }
        catch(InterruptedException v)
        {
            System.out.println("is inturrupted");
        }
    }
}
class d implements Runnable{
    public void run()
    {
        try{
            System.out.println("3 rd ticket was booked..!");
            Thread.sleep(300);
        }
        catch(InterruptedException f)
        {
            System.out.println("is inturrupted");
        }
    }
}
class g implements Runnable{
    public void run()
    {
        try{
            System.out.println("4 th ticket was booked..!");
            Thread.sleep(400);
        }
        catch(InterruptedException x)
        {
            System.out.println("is inturrupted");
        }
    }
}
class f implements Runnable{
    public void run()
    {
        try{
            System.out.println("5th ticket was booked..!");
            Thread.sleep(500);
        }
        catch(InterruptedException z)
        {
            System.out.println("is inturrupted");
        }
        System.out.println("counter closed...!");
    }
}
class fire
{
    public static void main(String args[])
    {
        a h=new a();
        b q=new b();
        c v=new c();
        d o=new d();
        g t=new g();
        f r=new f();
        Thread s=new Thread();
        s.start();
        h.run();
        q.run();
        v.run();
        o.run();
        t.run();
        r.run();
    }
}
