import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TaskAspect {
    @Pointcut("execution(public * run*(..))")
    private void runMethodCalled() {}

    @After(value = "runMethodCalled()" , argNames = "joinPoint")
    public void afterCall(JoinPoint joinPoint) {
        System.out.println("*Aspect works*");
    }
}