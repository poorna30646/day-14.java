class Main{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("Good Morning");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Afternoon");
            try{
                Thread.sleep(700);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Evening");
            try{
                Thread.sleep(900);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}