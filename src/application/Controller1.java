package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller1 implements Initializable{
	private static int[] numbers = new int[10] ;
    private static int index = 1 ;
    private InsortThread th;
    @FXML
    private TextArea Array = new TextArea() ;
    @FXML
    private TextArea Reasontf = new TextArea() ;
    @FXML
    private Label Reason = new Label() ;
    @FXML
    private Label Status = new Label() ;
    @FXML
    private TextField a1 = new TextField() ;
    @FXML
    private TextField a2 = new TextField() ;
    @FXML
    private TextField a3 = new TextField() ;
    @FXML
    private TextField a4 = new TextField() ;
    @FXML
    private TextField a5 = new TextField() ;
    @FXML
    private TextField a6 = new TextField() ;
    @FXML
    private TextField a7 = new TextField() ;
    @FXML
    private TextField a8 = new TextField() ;
    @FXML
    private TextField a9 = new TextField() ;
    @FXML
    private TextField a10 = new TextField() ;
    @FXML
    public void SetArray(ActionEvent e){
    	Reasontf.setText("");
    	//Array.clear();
    	//index=1;
        numbers[0] = Integer.parseInt(a1.getText().toString()) ;
        numbers[1] = Integer.parseInt(a2.getText().toString()) ;
        numbers[2] = Integer.parseInt(a3.getText().toString()) ;
        numbers[3] = Integer.parseInt(a4.getText().toString()) ;
        numbers[4] = Integer.parseInt(a5.getText().toString()) ;
        numbers[5] = Integer.parseInt(a6.getText().toString()) ;
        numbers[6] = Integer.parseInt(a7.getText().toString()) ;
        numbers[7] = Integer.parseInt(a8.getText().toString()) ;
        numbers[8] = Integer.parseInt(a9.getText().toString()) ;
        numbers[9] = Integer.parseInt(a10.getText().toString()) ;
        int i = 0 ;
        String num = new String("") ;
        while (i<10){
            num += String.valueOf(numbers[i]) ;
            num += "   " ;
            i++ ;
        }
        Array.clear();
        Array.setText("The array you have entered is: "+num+"\n");
        index=1;
    }
    @FXML
    public void NextStep(ActionEvent e){
    	//th.t.resume();
    
        if(index!=10){
            int j = index ;
            int tem ;
            while (j>0){
                if(numbers[j]<numbers[j-1]){
                	Reasontf.appendText("\nSwapping  "+numbers[j]+" and "+numbers[j-1]+" as "+numbers[j]+" < "+numbers[j-1]);
                    tem = numbers[j-1] ;
                    numbers[j-1] = numbers[j] ;
                    numbers[j] = tem ;
                }
                j-- ;
            }
            int i = 0 ;
            String num = new String("") ;
            while (i<10){
                num += String.valueOf(numbers[i]) ;
                num += "   " ;
                i++ ;
            }
            Array.appendText("After iteration "+index+" : " +num + "\n");
            index++ ;
        }
    }
    @FXML
    public void Play(ActionEvent e)
    {
    	th.t.resume(); 
    }
    @FXML
    public void Pause(ActionEvent e)
    {
    	th.t.suspend();
    }
    @FXML
    public void Exit(ActionEvent e)
    {
    	System.exit(0);
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		th=new InsortThread(index,numbers,Reasontf,Array);
		th.t.suspend();
		
	}

}
