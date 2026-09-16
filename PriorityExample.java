class PriorityExample extends Thread
{
  public void run(){
   System.out.println(
Thread.currentThread().getName()+"-priority:"+ 
Thread.currentThread().getpriority()
);
}
public static void main(String[] args){
  PriorityExample t1=new PriorityExample();
  PriorityExample t2=new PriorityExample();
  PriorityExample t3=new priorityExample();
  
  t1.setName("low PriorityThread");
  t2.setName("Normal priority Thread");
  t3.setName("High priority Thread");
  
t1.setPriority(Thread.d.MIN_PRIORITY);

t2.setPriority(Thread.d.MIN_PRIORITY);

t3.setPriority(Thread.MAX_PRIORITY);

 t1.start();
 t1.start();
 t3.start();
 }
 
 }
 
  
  