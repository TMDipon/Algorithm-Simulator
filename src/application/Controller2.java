package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller2 {
	private static int[] array=new int[36];
	private static int f=0;
	private static int l=array.length-1;
	private static int se;
	private static int index=1;
	boolean flag=false;
	@FXML
	private Label lbl1;
	@FXML
	private Label lbl2;
	@FXML
	private Label lbl3;
	@FXML
	private Label lbl4;
	@FXML
	private TextArea ta1;
	@FXML
	private TextArea ta2;
	@FXML
	private TextArea ta3;
	@FXML
	private TextArea ta4;
	@FXML
	private TextField txt1;
	@FXML
	private TextField txt2;
	@FXML
	private TextField txt3;
	@FXML
	private TextField txt4;
	@FXML
	private TextField txt5;
	@FXML
	private TextField txt6;
	@FXML
	private TextField txt7;
	@FXML
	private TextField txt8;
	@FXML
	private TextField txt9;
	@FXML
	private TextField txt10;
	@FXML
	private TextField txt11;
	@FXML
	private TextField txt12;
	@FXML
	private TextField txt13;
	@FXML
	private TextField txt14;
	@FXML
	private TextField txt15;
	@FXML
	private TextField txt16;
	@FXML
	private TextField txt17;
	@FXML
	private TextField txt18;
	@FXML
	private TextField txt19;
	@FXML
	private TextField txt20;
	@FXML
	private TextField txt21;
	@FXML
	private TextField txt22;
	@FXML
	private TextField txt23;
	@FXML
	private TextField txt24;
	@FXML
	private TextField txt25;
	@FXML
	private TextField txt26;
	@FXML
	private TextField txt27;
	@FXML
	private TextField txt28;
	@FXML
	private TextField txt29;
	@FXML
	private TextField txt30;
	@FXML
	private TextField txt31;
	@FXML
	private TextField txt32;
	@FXML
	private TextField txt33;
	@FXML
	private TextField txt34;
	@FXML
	private TextField txt35;
	@FXML
	private TextField txt36;
	@FXML
	private TextField txt37;
	
	
	public void Entersort(ActionEvent e)
	{
		index=1;
		ta2.clear();
		ta3.clear();
		ta4.clear();
		ta1.setText("");
		array[0]=Integer.parseInt(txt1.getText().toString()) ;
		array[1]=Integer.parseInt(txt2.getText().toString()) ;
		array[2]=Integer.parseInt(txt3.getText().toString()) ;
		array[3]=Integer.parseInt(txt4.getText().toString()) ;
		array[4]=Integer.parseInt(txt5.getText().toString()) ;
		array[5]=Integer.parseInt(txt6.getText().toString()) ;
		array[6]=Integer.parseInt(txt7.getText().toString()) ;
		array[7]=Integer.parseInt(txt8.getText().toString()) ;
		array[8]=Integer.parseInt(txt9.getText().toString()) ;
		array[9]=Integer.parseInt(txt10.getText().toString()) ;
		array[10]=Integer.parseInt(txt11.getText().toString()) ;
		array[11]=Integer.parseInt(txt12.getText().toString()) ;
		array[12]=Integer.parseInt(txt13.getText().toString()) ;
		array[13]=Integer.parseInt(txt14.getText().toString()) ;
		array[14]=Integer.parseInt(txt15.getText().toString()) ;
		array[15]=Integer.parseInt(txt16.getText().toString()) ;
		array[16]=Integer.parseInt(txt17.getText().toString()) ;
		array[17]=Integer.parseInt(txt18.getText().toString()) ;
		array[18]=Integer.parseInt(txt19.getText().toString()) ;
		array[19]=Integer.parseInt(txt20.getText().toString()) ;
		array[20]=Integer.parseInt(txt21.getText().toString()) ;
		array[21]=Integer.parseInt(txt22.getText().toString()) ;
		array[22]=Integer.parseInt(txt23.getText().toString()) ;
		array[23]=Integer.parseInt(txt24.getText().toString()) ;
		array[24]=Integer.parseInt(txt25.getText().toString()) ;
		array[25]=Integer.parseInt(txt26.getText().toString()) ;
		array[26]=Integer.parseInt(txt27.getText().toString()) ;
		array[27]=Integer.parseInt(txt28.getText().toString()) ;
		array[28]=Integer.parseInt(txt29.getText().toString()) ;
		array[29]=Integer.parseInt(txt30.getText().toString()) ;
		array[30]=Integer.parseInt(txt31.getText().toString()) ;
		array[31]=Integer.parseInt(txt32.getText().toString()) ;
		array[32]=Integer.parseInt(txt33.getText().toString()) ;
		array[33]=Integer.parseInt(txt34.getText().toString()) ;
		array[34]=Integer.parseInt(txt35.getText().toString()) ;
		array[35]=Integer.parseInt(txt36.getText().toString()) ;
		int i = 0 ;
        String num = new String("") ;
        while (i<36){
            num += String.valueOf(array[i]) ;
            num += "   " ;
            i++ ;
        }
        ta1.clear();
        ta1.setText("The array you have entered is: "+num+"\n");
        
        int l;
        for(l=1;l<36;l++)
        {
        	int j=l;
        	int t;
        	while(j>0)
        	{
        		if(array[j-1]>array[j])
        		{
        			t=array[j-1];
        			array[j-1]=array[j];
        			array[j]=t;
        		}
        		j--;
        	}
        }
        int k=0;
        String num1=new String("Sorted form: ");
        while(k<36)
        {
        	num1+=String.valueOf(array[k]);
        	num1+="  ";
        	k++;
        }
        ta1.appendText("\n"+num1+"\n");
        f=0;
        l=array.length-1;
        
	}
	
	
	public void Next(ActionEvent e)
	{
		int m=0;
		
		se=Integer.parseInt(txt37.getText().toString());
		if(f<=l)
		{
			ta2.clear();
			ta2.setText("Comparison: "+index);
			ta2.appendText("\nLowerBound : "+f+" Element at index: "+f+" is "+array[f]);
			ta2.appendText("\nUpperBound : "+l+" Element at index: "+l+" is "+array[l]);
			m=(f+l)/2;
			if(array[m]==se)
			{
		       f=10+l;
			}
			if(array[m]>se)
			{
				l=m-1;
			}
			if(array[m]<se)
			{
				f=m+1;
			}
			index++;
			ta2.appendText("\nTotal comparisons made: "+(index-1));
		}
		
		if(array[m]==se)
		{
			ta3.clear();
			ta3.setText("The number is found and it's index is: "+m);
			
		}
		
		if((array[m]!=se)&&(f>l)&&(f!=(10+l)))
		{
			ta3.clear();
			ta3.setText("There is no such number in the given array");
		
		}
		/*
		if((!ta3.getText().equals("Null"))&&(flag!=0))
		{
			ta2.appendText("\nTotal comparisons made: "+(index-1));
			
		}
		*/
	}
	
	public void Play(ActionEvent e)
	{
		int m=0;
		se=Integer.parseInt(txt37.getText().toString());
		while(f<=l)
		{
			ta4.appendText("\nComparison: "+index);
			ta4.appendText("\nLowerBound : "+f+" Element at index: "+f+" is "+array[f]);
			ta4.appendText("\nUpperBound : "+l+" Element at index: "+l+" is "+array[l]);
			
			
			m=(f+l)/2;
			if(array[m]==se)
			{
		       break;
			}
			if(array[m]>se)
			{
				l=m-1;
			}
			if(array[m]<se)
			{
				f=m+1;
			}
			index++;
			
		}
		ta4.appendText("\nTotal comparisons made: "+(index));
		if(array[m]==se)
		{
			ta3.clear();
			ta3.setText("The number is found and it's index in the sorted form is: "+m);
		}
		
		if(array[m]!=se)
		{
			ta3.clear();
			ta3.setText("There is no such number in the given array");
		}
		
		
	}
	
	public void Exit(ActionEvent e)
	{
		System.exit(0);
	}

}
