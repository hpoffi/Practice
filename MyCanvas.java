import java.awt.*;  
import javax.swing.JFrame;  
  
public class MyCanvas extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("/Users/harshitpatel/Desktop/My_Document/passport photo.jpg");  
        g.drawImage(i, 120,100,this);  
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    class AdditionalTask implements Runnable {
        @Override
        public void run() {
            // Task that runs concurrently with the main thread
            for (int i = 0; i < 5; i++) {
                System.out.println("Additional Thread executing task: " + i);
                try {
                    Thread.sleep(1000);//introducing wait time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        public static void main(String[] args) {  
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  

        AdditionalTask additionalTask = m.new AdditionalTask(); // Creating instance of AdditionalTask using m
        Thread additionalThread = new Thread(additionalTask);
        additionalThread.start();
    }  
  
}