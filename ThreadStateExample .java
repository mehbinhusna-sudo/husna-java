class ThreadStateExample extends Thread{
  public void run(){
   try{
   System.out.println("Thread is RUNNING");
   Thread.sleep(1000);
System.out.println("Thread is running again");
}catch(interruptedException e){
 System.out.prtinln(e);
}
}
public static void main(String[] args)throws Exception{
ThreadStateExample t= new ThreadStateExample();
System.out.println("After creating thread:"+t.getState());
t.start();
System.out.println("After start():"+t.getState());
Thread.sleep(200);
System.out.println("While sleeping:"+t.getState());
t.join();
System.out.println("After completion:"+t.getState());
}
}

