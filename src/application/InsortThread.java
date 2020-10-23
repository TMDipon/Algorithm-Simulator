package application;

import javafx.scene.control.TextArea;

public class InsortThread implements Runnable {
	
	private int index ;
    private int numbers[]  ;
    private TextArea Reasontf ;
    private TextArea Array ;
    Thread t;
    
    public InsortThread(int n,int[] a,TextArea b,TextArea c)
    {
    	index=n;
    	numbers=a;
    	Reasontf=b;
    	Array=c;
    	t=new Thread(this);
    	t.start();
    }
    
    @Override
    public void run()
    {
    	int k;
    	int t;
    	for(k=1;k<10;k++)
    	{
    		int j=k;
    		while(j>0)
    		{
    			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			if(numbers[j]<numbers[j-1]){
                	
                	Reasontf.appendText("\nSwapping  "+numbers[j]+" and "+numbers[j-1]+" as "+numbers[j]+" < "+numbers[j-1]);
                    t = numbers[j-1] ;
                    numbers[j-1] = numbers[j] ;
                    numbers[j] = t ;
                }
                j-- ;
                int i = 0 ;
                String num = new String("") ;
                while (i<10){
                    num += String.valueOf(numbers[i]) ;
                    num += "   " ;
                    i++ ;
                }
                Array.appendText("After iteration "+index+" : " +num + "\n");
                index++;
    		}
    		
    	}
    }

}
