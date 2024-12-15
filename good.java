class GreetingThread extends Thread {
    private String greeting;

    public GreetingThread(String greeting, int hour) {
        this.greeting = greeting;
    }
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println(greeting);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class fire{
    public static void main(String[] args) {
        // Create threads for each greeting
        GreetingThread morningThread = new GreetingThread("Good Morning", 8);
        GreetingThread afternoonThread = new GreetingThread("Good Afternoon", 12);
        GreetingThread eveningThread = new GreetingThread("Good Evening", 18);
        morningThread.start();
        afternoonThread.start();
        eveningThread.start();
    }
}

