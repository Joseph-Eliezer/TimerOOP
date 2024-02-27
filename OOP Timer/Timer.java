public class Timer {
    private double hours;
    private double mns;
    private double sec;

    public Timer() {
       this.hours = 0;
       this.mns = 0;
       this.sec = 0;
    }

    public void setTimer() {
        Input input = new Input();

        this.hours = input.getHours();
        this.mns = input.getMinutes();
        this.sec = input.getSeconds();

        while (hours > 0 || mns > 0 || sec > 0) {
            try {
                Thread.sleep(1000);
                if (sec > 0) {
                    sec--;
                } else if (mns > 0) {
                    sec = 59;
                    mns--;
                } else if (hours > 0) {
                    sec = 59;
                    mns = 59;
                    hours--;
                }
                clearScreen();
                System.out.printf("%02d:%02d:%02d", (int)hours, (int)mns, (int)sec);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            continue;
        } 
        System.out.println(" Tapos na");
        
        
    }
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
