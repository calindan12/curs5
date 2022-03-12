
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Task {
    private String taskName;
    private int taskId;
    private int executionTime;

    public static int numberOfTasks;
    private final Random random = new Random();

    void init(){
        numberOfTasks++;
        this.taskId = generateId();
        this.taskName = "Task " + taskId;
        this.executionTime = new Random().nextInt(3) + 1;
        System.out.println("Task name: " + taskName + " was created");


    }
    public void runMethod() throws InterruptedException {
        System.out.println("sleep: " + executionTime + " seconds");
        TimeUnit.SECONDS.sleep(executionTime);
        Thread.sleep(executionTime * 1000);
        System.out.println("finished");
    }
    public Integer generateId(){
        return new Random().nextInt(100);
    }
    public void destroy(){
        numberOfTasks--;
        System.out.println("Task name" + this.taskName + " destroyed");
    }

}
