class a extends Thread{
    public void r()
    {
        System.out.println("hello iam thread!");
    }
}
class fire{
    public static void main(String args[])
    {
        a g=new a();
        g.r();
        g.start();

    }
}
