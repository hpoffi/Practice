import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
    private String name;
    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        
        Thread.sleep(1000);
        return "Hello" + name;
    }
}
    public class CallableRunner{
        public static void main(String[] args) throws InterruptedException, ExecutionException{

            ExecutorService executorService = Executors.newFixedThreadPool(1);
            // Future is not any method just a promise
            Future<String> welcomeFuture=
            executorService.submit(new CallableTask("28minutes"));

            System.out.print("\n new CallableTask(\"28minutes\") executed ");
            String welcomeMessage = welcomeFuture.get();
            System.out.print(welcomeMessage);

            System.out.print("\n Main Completed");

            
        }
    }

   