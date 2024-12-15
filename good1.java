class GreetingThread extends Thread {
    private String greeting;
    private int hour;

    public GreetingThread(String greeting, int hour) {
        this.greeting = greeting;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // sleep for the specified number of hours
                System.out.println(greeting);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        GreetingThread morningThread = new GreetingThread("Good Morning", 8);
        GreetingThread afternoonThread = new GreetingThread("Good Afternoon", 4); 
        GreetingThread eveningThread = new GreetingThread("Good Evening", 4);
        morningThread.start();
        afternoonThread.start();
        eveningThread.start();
    }
}

