package corejava.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutures {

    static void main() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            //Simullating asynchronous
            if(true){
                System.out.println("inside Completable future");
                throw new RuntimeException("Something went wrong");
            }
            return "Task Completed";
        }).handle((result,ex)->{
            if(ex!=null){
                System.out.println("Inside catch");
                System.out.println("Error Occured : "+ ex.getMessage());
                return "Recovered from error";
            }
            return result;
        });

        try {
            System.out.println("Calling futures using future.get" );
            System.out.println(future.get());
        }
        catch (InterruptedException | ExecutionException ex){
            ex.printStackTrace();
        }
    }
}
