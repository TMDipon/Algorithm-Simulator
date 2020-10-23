package application;
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;


public class Main extends Application implements Runnable {
	
	List<Rectangle> rect=new ArrayList<Rectangle>();
	double[] height;
	int[] input;
	int len;
	double[] px;
	
	ParallelTransition p=new ParallelTransition();
	
	Stage stg;
	Scene Insortscene;
	Group group;
	Button insort,sort,show,b1,ex1;
	Label l9,l10,l11,l12;
	TextField array,number,st1,re1;
	GridPane Insortpane;
	Pane root;
	double width=35;
	
	//Vaiables for binarysearch
	List<Rectangle> rect1=new ArrayList<Rectangle>();
	int len1,input1[];
	double px1[];
	double px2[];
	Scene binserscene;
	Group group1;
	Button binser,showta,find,b2,ex2;
	TextField f,array1,elem1,reason,result;
	Label l1,l2,l3,lr,re;
	Label lt4,lt5,lt6,lt7;
	Rectangle rt1,rt2,rt3,rt4;
	FlowPane pane2;
	GridPane binserpane;
	int numtofind;
	List<Text> tx=new ArrayList<Text>();
	int first,last,md;
	
	//Variables for bfs
	List<Circle> circ=new ArrayList<Circle>();
	List<Line> lin=new ArrayList<Line>();
	List<Text> tx1=new ArrayList<Text>();
	Queue<Integer> queue;
	int non,input2[][];
	double px3[];
	double py3[];
	double dx=800.0,dy=200.0;
	Scene bfsscene;
	Group group3;
	GridPane bfspane;
	Button bfs,stn,ctg,tra,b3,ex3;
	Label l4,l5,l6;
	TextField tf1,tf2,tf3;
	int src,k=0;
	int[] visited,level;
	Paint[] color = {Color.YELLOW, Color.VIOLET, Color.CHARTREUSE, Color.DIMGRAY, Color.CHOCOLATE, Color.DARKGREEN, Color.CORNFLOWERBLUE,Color.DARKSLATEGRAY};
	
	//variables for dfs
	List<Circle> circ1=new ArrayList<Circle>();
	List<Line> lin1=new ArrayList<Line>();
	List<Text> tx2=new ArrayList<Text>();
	Stack<Integer> stack;
	int non1,input3[][];
	double px4[];
	double py4[];
	double dx1=800.0,dy1=200.0;
	Scene dfsscene;
	Group group4;
	GridPane dfspane;
	Button dfs,stn1,ctg1,tra1,b4,ex4;
	Label l13,l14,l15;
	TextField tf7,tf8,tf9;
	int src1,k1=0;
	int visited1[],level1[];
	Paint[] color1 = {Color.YELLOW, Color.VIOLET, Color.CHARTREUSE, Color.DIMGRAY, Color.CHOCOLATE, Color.DARKGREEN,Color.CORNFLOWERBLUE, Color.DARKSLATEGRAY};
	
	Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stg=primaryStage;
		    root=FXMLLoader.load(getClass().getResource("/application/Front.fxml"));
			insort=new Button("Insertion Sort(Animation)");
			insort.setTranslateX(100);
			insort.setTranslateY(360);
			insort.setPrefWidth(295);
			insort.setPrefHeight(45);
			binser=new Button("Binary Search(Animation)");
			binser.setTranslateX(100);
			binser.setTranslateY(440);
			binser.setPrefWidth(295);
			binser.setPrefHeight(45);
			bfs=new Button("Breadth First Search");
			bfs.setTranslateX(100);
			bfs.setTranslateY(520);
			bfs.setPrefWidth(295);
			bfs.setPrefHeight(45);
			dfs=new Button("Depth First Search");
			dfs.setTranslateX(100);
			dfs.setTranslateY(600);
			dfs.setPrefWidth(295);
			dfs.setPrefHeight(45);
			insort.setStyle("-fx-font-size: 21px;-fx-text-fill: #26486b");
			binser.setStyle("-fx-font-size: 21px;-fx-text-fill: #26486b");
			bfs.setStyle("-fx-font-size: 21px;-fx-text-fill: #26486b");
			dfs.setStyle("-fx-font-size: 21px;-fx-text-fill: #26486b");
			Thread t=new Thread(this);
			t.start();
			
			insort.setOnAction((ActionEvent e) -> {
				
				ButtonClicked(e);
			});
			
			binser.setOnAction((ActionEvent e) -> {
				
				ButtonClicked(e);
			});
			bfs.setOnAction((ActionEvent e) -> {
				
				ButtonClicked(e);
			});
			dfs.setOnAction((ActionEvent e) -> {
				
				ButtonClicked(e);
			});
			
			
			root.getChildren().addAll(insort,binser,bfs,dfs);
			root.setStyle("-fx-background-color: white;-fx-padding: 10px;");
			
			Insortpane=new GridPane();
			Insortpane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			Insortscene=new Scene(Insortpane,1400,700);
			binserpane=new GridPane();
			binserpane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			binserscene=new Scene(binserpane,1400,700);
			bfspane=new GridPane();
			bfspane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			bfsscene=new Scene(bfspane,1400,700);
			dfspane=new GridPane();
			dfspane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			dfsscene=new Scene(dfspane,1400,700);
			
			
			group1=new Group();
			l1=new Label();
			l1.setText("Number to Find:");
			l1.relocate(100, 200);
			f=new TextField();
			f.relocate(300, 200);
			l2=new Label();
			l2.setText("Number of Elements:");
			l2.relocate(100, 100);
			elem1=new TextField();
			elem1.relocate(300, 100);
			l3=new 	Label();
			l3.setText("Enter the Array:");
			l3.relocate(100, 150);
			array1=new TextField();
			array1.relocate(300, 150);
			lr=new Label();
			lr.setText("Status :");
			lr.relocate(500, 200);
			lr.prefHeight(50);
			reason=new TextField();
			reason.relocate(600, 200);
			reason.setPrefWidth(300);
			reason.setPrefHeight(45);
			reason.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			re=new Label();
			re.relocate(100, 600);
			re.setText("Result");
			re.prefHeight(50);
			result=new TextField();
			result.relocate(200, 600);
			result.setPrefWidth(250);
			result.setPrefHeight(45);
			result.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			rt1=new Rectangle(40.0,45.0,Color.BLUEVIOLET);
			rt1.setX(970);
			rt1.setY(100);
			lt4=new Label();
			lt4.setText("-->");
			lt4.relocate(1015.0, 115.5);
			rt2=new Rectangle(40.0,45.0,Color.DARKCYAN);
			rt2.setX(1040);
			rt2.setY(100);
			lt5=new Label();
			lt5.setText(":  Mid element in Comparision");
			lt5.relocate(1100, 110);
			lt5.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			rt3=new Rectangle(40.0,45.0,Color.DARKCYAN);
			rt3.setX(970);
			rt3.setY(180);
			lt6=new Label();
			lt6.setText(":  Non-Matching Elements");
			lt6.relocate(1040, 190);
			lt6.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			rt4=new Rectangle(40.0,45.0,Color.TOMATO);
			rt4.setX(970);
			rt4.setY(260);
			lt7=new Label();
			lt7.setText(": Element that has matched");
			lt7.relocate(1040, 270);
			lt7.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			
			showta=new Button();
			showta.setText("Show the Array");
			showta.relocate(100, 250);
			find=new Button();
			find.setText("Find the Element");
			find.relocate(300, 250);
			b2=new Button();
			b2.setText("Return");
			b2.setPrefWidth(90);
			b2.setPrefHeight(40);
			b2.relocate(1100, 600);
			ex2=new Button();
			ex2.setText("Exit");
			ex2.setPrefWidth(90);
			ex2.setPrefHeight(40);
			ex2.relocate(1200, 600);
			
			group1.getChildren().addAll(l1,l2,l3,f,array1,elem1,showta,find,lr,reason,re,result,b2,ex2,rt1,rt2,lt4,lt5,rt3,lt6,rt4,lt7);
			
			group=new Group();
			
			sort=new Button();
			sort.setText("Sort");
			sort.relocate(100, 90);
			show=new Button();
			show.setText("Show Graphically");
			show.relocate(150, 90);
			b1=new Button();
			b1.setText("Return");
			b1.setPrefWidth(90);
			b1.setPrefHeight(40);
			b1.relocate(1100, 600);
			ex1=new Button();
			ex1.setText("Exit");
			ex1.setPrefWidth(90);
			ex1.setPrefHeight(40);
			ex1.relocate(1200, 600);
			
			number=new TextField();
			number.relocate(260, 10);
			array=new TextField();
			array.relocate(260, 40);
			l9=new Label();
			l9.setText("Number of elements:");
			l9.relocate(100, 10);
			l10=new Label();
			l10.setText("Enter the Array:");
			l10.relocate(100, 40);
			l11=new Label();
			l11.setText("Status:");
			l11.setPrefWidth(70);
			l11.setPrefHeight(30);
			l11.relocate(500, 10);
			l12=new Label();
			l12.setText("Result:");
			l12.setPrefWidth(70);
			l12.setPrefHeight(30);
			l12.relocate(500, 60);
			st1=new TextField();
			st1.relocate(600, 10);
			st1.setPrefWidth(300);
			st1.setPrefHeight(30);
			re1=new TextField();
			re1.setPrefWidth(200);
			re1.setPrefHeight(30);
			re1.relocate(600, 60);
			
			group.getChildren().addAll(sort,show,number,array,l9,l10,b1,ex1,l11,l12,re1,st1);
			
			group3=new Group();
			l4=new Label();
			l4.setText("Number of nodes(max. 13):");
			l4.relocate(100, 100);
			tf1=new TextField();
			tf1.relocate(250, 100);
			l5=new Label();
			l5.setText("Enter the Array:");
			l5.relocate(100, 150);
			tf2=new TextField();
			tf2.relocate(250, 150);
			l6=new 	Label();
			l6.setText("Source:");
			l6.relocate(100, 200);
			tf3=new TextField();
			tf3.relocate(250, 200);
		
			b3=new Button();
			b3.setText("Return");
			b3.setPrefWidth(90);
			b3.setPrefHeight(40);
			b3.relocate(1100, 600);
			ex3=new Button();
			ex3.setText("Exit");
			ex3.setPrefWidth(90);
			ex3.setPrefHeight(40);
			ex3.relocate(1200, 600);
			
			stn=new Button();
			stn.setText("Show the Nodes");
			stn.setPrefHeight(40);
			stn.relocate(100, 250);
			ctg=new Button();
			ctg.setText("Construct the Graph");
			ctg.setPrefHeight(40);
			ctg.relocate(100, 320);
			tra=new Button();
			tra.setText("Traverse");
			tra.setPrefHeight(40);
			tra.relocate(100, 390);
			
			group3.getChildren().addAll(l4,l5,l6,tf1,tf2,tf3,stn,ctg,tra,b3,ex3);
			
			group4=new Group();
			l13=new Label();
			l13.setText("Number of nodes:");
			l13.relocate(100, 100);
			tf7=new TextField();
			tf7.relocate(250, 100);
			l14=new Label();
			l14.setText("Enter the Array:");
			l14.relocate(100, 150);
			tf8=new TextField();
			tf8.relocate(250, 150);
			l15=new 	Label();
			l15.setText("Source:");
			l15.relocate(100, 200);
			tf9=new TextField();
			tf9.relocate(250, 200);
			
			
			stn1=new Button();
			stn1.setText("Show the Nodes");
			stn1.relocate(100, 250);
			ctg1=new Button();
			ctg1.setText("Construct the Graph");
			ctg1.relocate(100, 320);
			tra1=new Button();
			tra1.setText("Traverse");
			tra1.relocate(100, 390);
			b4=new Button();
			b4.setText("Return");
			b4.setPrefWidth(90);
			b4.setPrefHeight(40);
			b4.relocate(1100, 600);
			ex4=new Button();
			ex4.setText("Exit");
			ex4.setPrefWidth(90);
			ex4.setPrefHeight(40);
			ex4.relocate(1200, 600);
			
			
			group4.getChildren().addAll(l13,l14,l15,tf7,tf8,tf9,stn1,ctg1,tra1,b4,ex4);
			
			
			TranslateTransition[] tt=new TranslateTransition[20];
			
			sort.setOnAction((ActionEvent e3) -> {
				ButtonClicked(e3);
			});
			
			show.setOnAction((ActionEvent e3) -> {
				ButtonClicked(e3);
			});
			showta.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			
			find.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			stn.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			ctg.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			tra.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			stn1.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			ctg1.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			tra1.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			
			
			
			b1.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			ex1.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			b2.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			ex2.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			b3.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			ex3.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			b4.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			ex4.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			
			
			
			
			scene = new Scene(root,1400,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Insortscene=new Scene(group,1400,700); 
			binserscene=new Scene(group1,1400,700);
			bfsscene=new Scene(group3,1400,700);
			dfsscene=new Scene(group4,1400,700);
			stg.setTitle("Algorithm Simulator");
			stg.setScene(scene);
			stg.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void ButtonClicked(ActionEvent e) {
		if(e.getSource()==insort)
		{
			stg.setScene(Insortscene);
			stg.setTitle("INSERTION SORT");
		}
		if(e.getSource()==show)
		{
			group.getChildren().removeAll(rect);
			re1.clear();
			st1.clear();
			String s=number.getText();
			len=Integer.parseInt(s);
			
			input=new int[len];
			px=new double[len];
			String s1=array.getText();
			String[] am=s1.split(" ");
			
			
			System.out.print("The array you have entered is: ");
			for(int i=0;i<len;i++)
			{
				input[i]=Integer.parseInt(am[i]);
				System.out.print(input[i]+" ");
			}
			
			CHeight(input);
			for(int i=0;i<len;i++)
			{
	
				rect.add(i, new Rectangle(width,(height[i]),Color.CADETBLUE));
				
				px[i]=50*i+50;
				rect.get(i).setTranslateX(px[i]);
				rect.get(i).setTranslateY(150.0);
				group.getChildren().add(rect.get(i));
			}
			stg.setScene(Insortscene);
		}
		
		if(e.getSource()==sort)
		{
			SequentialTransition st=new SequentialTransition();
			Thread t=new Thread(new Runnable() {
				
				@Override
				public void run()
				{
					int k,t3;
					for(k=1;k<len;k++)
					{
						int j=k;
						while(j>0)
						{
							if(input[j-1]<input[j])
							{
								st1.clear();
								st1.setText("Not Swapping  "+input[j-1]+" and "+input[j]+" as "+input[j-1]+" < "+input[j]);
								Highlight2(rect.get(j-1),rect.get(j));
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							if(input[j-1]>input[j])
							{
								st1.clear();
								st1.setText("Swapping  "+input[j-1]+" and "+input[j]+" as "+input[j-1]+" > "+input[j]);
								t3=input[j-1];
								input[j-1]=input[j];
								input[j]=t3;
								Highlight1(rect.get(j-1),rect.get(j));
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								Animate(j-1,j);
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								Collections.swap(rect, j-1, j);
							}
							j--;
						}
					}
					st1.clear();
					re1.setText("The array is sorted");
				}
			});
			
			t.start();
			stg.setScene(Insortscene);
		}
		
		if(e.getSource()==b1)
		{
			Insortpane=new GridPane();
			Insortpane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			Insortscene=new Scene(Insortpane,1400,700);
			group=new Group();
			
			sort=new Button();
			sort.setText("Sort");
			sort.relocate(100, 90);
			show=new Button();
			show.setText("Show Graphically");
			show.relocate(150, 90);
			b1=new Button();
			b1.setText("Return");
			b1.setPrefWidth(90);
			b1.setPrefHeight(40);
			b1.relocate(1100, 600);
			ex1=new Button();
			ex1.setText("Exit");
			ex1.setPrefWidth(90);
			ex1.setPrefHeight(40);
			ex1.relocate(1200, 600);
			
			number=new TextField();
			number.relocate(260, 10);
			array=new TextField();
			array.relocate(260, 40);
			l9=new Label();
			l9.setText("Number of elements:");
			l9.relocate(100, 10);
			l10=new Label();
			l10.setText("Enter the Array:");
			l10.relocate(100, 40);
			l11=new Label();
			l11.setText("Status:");
			l11.setPrefWidth(70);
			l11.setPrefHeight(30);
			l11.relocate(500, 10);
			l12=new Label();
			l12.setText("Result:");
			l12.setPrefWidth(70);
			l12.setPrefHeight(30);
			l12.relocate(500, 60);
			st1=new TextField();
			st1.relocate(600, 10);
			st1.setPrefWidth(300);
			st1.setPrefHeight(30);
			re1=new TextField();
			re1.setPrefWidth(200);
			re1.setPrefHeight(30);
			re1.relocate(600, 60);
			
			group.getChildren().addAll(sort,show,number,array,l9,l10,b1,ex1,l11,l12,st1,re1);
			TranslateTransition[] tt=new TranslateTransition[20];
			Insortscene=new Scene(group,1400,700); 
			sort.setOnAction((ActionEvent e3) -> {
				ButtonClicked(e3);
			});
			
			show.setOnAction((ActionEvent e3) -> {
				ButtonClicked(e3);
			});
			b1.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			ex1.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			stg.setScene(scene);
			stg.setTitle("ALGORITHM SIMULATOR");
		}
		if(e.getSource()==ex1)
		{
		  System.exit(0);
		}
		
		if(e.getSource()==binser)
		{
			stg.setScene(binserscene);
			stg.setTitle("BINARY SEARCH");
		}
		if(e.getSource()==showta)
		{
			group1.getChildren().removeAll(rect1);
			group1.getChildren().removeAll(tx);
			result.clear();
			//reason.clear();
			String s1=f.getText();
			numtofind=Integer.parseInt(s1);
			String s2=elem1.getText();
			len1=Integer.parseInt(s2);
			
			input1=new int[len1];
			px1=new double[len1];
			px2=new double[len1];
			String s3=array1.getText();
			String[] s4=s3.split(" ");
			
			System.out.println("Number to find is: "+numtofind);
			System.out.println("Size of the sorted array: "+len1);
			System.out.println("The array you have entered is: ");
			for(int i=0;i<len1;i++)
			{
				input1[i]=Integer.parseInt(s4[i]);
				System.out.print(input1[i]+" ");
			}
			
			for(int i=0;i<len1;i++)
			{
				px2[i]=(50*i)+65;
				rect1.add(i,new Rectangle(40.0, 45.0, Color.BURLYWOOD));
				tx.add(i, new Text(px2[i],475.0,s4[i]));
				px1[i]=(50*i)+50;
				rect1.get(i).setTranslateX(px1[i]);
				rect1.get(i).setTranslateY(450.0);
				
				group1.getChildren().addAll(rect1.get(i),tx.get(i));
			}
			
			stg.setScene(binserscene);
			
		}
		if(e.getSource()==find)
		{
			Thread m1=new Thread(new Runnable(){
				
				public void run()
				
				{
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					first=0;
					last=len1-1;
					md=0;
					int idx=1;
					while(first<=last)
					{
						System.out.println("Comparison: "+idx);
						System.out.println("LowerBound : "+first+" Element at index: "+first+" is "+input1[first]);
						System.out.println("UpperBound : "+last+" Element at index: "+last+" is "+input1[last]);
						System.out.println("\n");
						md=(first+last)/2;
						Highlight(rect1.get(md));
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if(input1[md]>numtofind)
						{
							//rect1.get(md).setFill(Color.DARKCYAN);
							Animate1(md,last);
							reason.clear();
							reason.setText("value at index "+md+" is "+input1[md]+" which is greater than "+numtofind);
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							last=md-1;
						}
						
						else if(input1[md]<numtofind)
						{
							//rect1.get(md).setFill(Color.DARKCYAN);
							Animate1(first,md);
							reason.clear();
							reason.setText("value at index "+md+" is "+input1[md]+" which is less than "+numtofind);
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							first=md+1;
						}
						else if(input1[md]==numtofind)
						{
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
							rect1.get(md).setFill(Color.TOMATO);
							reason.clear();
							result.setText("The number found at index: "+md);
							break;
						}
						
						idx++;
					}
					
					if(first>last)
					{
						reason.clear();
						result.setText("The number is not found");
					}
					
				}
				
				
			});
			
			m1.start();
			stg.setScene(binserscene);
		}
		if(e.getSource()==b2)
		{
			binserpane=new GridPane();
			binserpane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			binserscene=new Scene(binserpane,1400,700);
			group1=new Group();
			l1=new Label();
			l1.setText("Number to Find:");
			l1.relocate(100, 200);
			f=new TextField();
			f.relocate(300, 200);
			l2=new Label();
			l2.setText("Number of Elements:");
			l2.relocate(100, 100);
			elem1=new TextField();
			elem1.relocate(300, 100);
			l3=new 	Label();
			l3.setText("Enter the Array:");
			l3.relocate(100, 150);
			array1=new TextField();
			array1.relocate(300, 150);
			lr=new Label();
			lr.setText("Status :");
			lr.relocate(500, 200);
			lr.prefHeight(50);
			reason=new TextField();
			reason.relocate(600, 200);
			reason.setPrefWidth(300);
			reason.setPrefHeight(45);
			reason.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			re=new Label();
			re.relocate(100, 600);
			re.setText("Result");
			re.prefHeight(50);
			result=new TextField();
			result.relocate(200, 600);
			result.setPrefWidth(250);
			result.setPrefHeight(45);
			result.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			rt1=new Rectangle(40.0,45.0,Color.BLUEVIOLET);
			rt1.setX(970);
			rt1.setY(100);
			lt4=new Label();
			lt4.setText("-->");
			lt4.relocate(1015.0, 115.5);
			rt2=new Rectangle(40.0,45.0,Color.DARKCYAN);
			rt2.setX(1040);
			rt2.setY(100);
			lt5=new Label();
			lt5.setText(":  Mid element in Comparision");
			lt5.relocate(1100, 110);
			lt5.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			rt3=new Rectangle(40.0,45.0,Color.DARKCYAN);
			rt3.setX(970);
			rt3.setY(180);
			lt6=new Label();
			lt6.setText(":  Non-Matching Elements");
			lt6.relocate(1040, 190);
			lt6.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			rt4=new Rectangle(40.0,45.0,Color.TOMATO);
			rt4.setX(970);
			rt4.setY(260);
			lt7=new Label();
			lt7.setText(": Element that has matched");
			lt7.relocate(1040, 270);
			lt7.setStyle("-fx-font-size: 14px;-fx-text-fill: #26486b;");
			
			showta=new Button();
			showta.setText("Show the Array");
			showta.relocate(100, 250);
			find=new Button();
			find.setText("Find the Element");
			find.relocate(300, 250);
			b2=new Button();
			b2.setText("Return");
			b2.setPrefWidth(90);
			b2.setPrefHeight(40);
			b2.relocate(1100, 600);
			ex2=new Button();
			ex2.setText("Exit");
			ex2.setPrefWidth(90);
			ex2.setPrefHeight(40);
			ex2.relocate(1200, 600);
			
			group1.getChildren().addAll(l1,l2,l3,f,array1,elem1,showta,find,lr,reason,re,result,b2,ex2,rt1,rt2,rt3,rt4,lt4,lt5,lt6,lt7);
			binserscene=new Scene(group1,1400,700);
			showta.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			
			find.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			b2.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			ex2.setOnAction((ActionEvent e2) -> {
				ButtonClicked(e2);
			});
			stg.setScene(scene);
			stg.setTitle("ALGORITHM SIMULATOR");
		}
		if(e.getSource()==ex2)
		{
		  System.exit(0);
		}
		
		if(e.getSource()==bfs)
		{
			stg.setScene(bfsscene);
			stg.setTitle("BREADTH FIRST SEARCH");
		}
		
		if(e.getSource()==stn)
		{
			group3.getChildren().removeAll(circ);
			group3.getChildren().removeAll(lin);
			group3.getChildren().removeAll(tx1);
			
			
			String sb1=tf1.getText();
			non=Integer.parseInt(sb1);
			
			
			input2=new int[non+1][non+1];
			px3=new double[non];
			py3=new double[non];
			
			String sb2=tf2.getText();
			String sb[]=sb2.split(" ");
			
			for(int i=1;i<=non;i++)
			{
				for(int j=1;j<=non;j++)
				{
					int ns=(j-1)+(non*(i-1));
					input2[i][j]=Integer.parseInt(sb[ns]);
				}
			}
			
			for(int i=0;i<non;i++)
			{
				if(i==0)
				{
					px3[i]=dx;
					py3[i]=dy-50;				
				}
				
				else if((i%2)==1)
				{
					if(i==1)
					{
						px3[i]=dx-(40*i)+3;
						py3[i]=dy+(40*i)+10;
					}
					if(i==3)
					{
						px3[i]=dx-(40*i)+3;
						py3[i]=dy+(40*i)-10;
					}
					if(i==5)
					{
						px3[i]=dx-(40*i)+3;
						py3[i]=dy+(40*i)+9;
					}
					if(i==7)
					{
						px3[i]=dx-(40*i)+3;
						py3[i]=dy+(40*i)-9;
					}
					if(i==9)
					{
						px3[i]=dx-(40*i)+3;
						py3[i]=dy+(40*i)+11;
					}
					if(i==11)
					{
						px3[i]=dx-(40*i)+3;
						py3[i]=dy+(40*i)-11;
					}
					if(i==13)
					{
						px3[i]=dx-(40*i)+3;
						py3[i]=dy+(40*i)+12;
					}
					
				}
				
				else if((i%2)==0)
				{
					if(i==2)
					{
						px3[i]=dx+(40*(i-1))-3;
						py3[i]=dy+(40*(i-1))+10;
					}
					if(i==4)
					{
						px3[i]=dx+(40*(i-1))-3;
						py3[i]=dy+(40*(i-1))-10;
					}
					if(i==6)
					{
						px3[i]=dx+(40*(i-1))-3;
						py3[i]=dy+(40*(i-1))+9;
					}
					if(i==8)
					{
						px3[i]=dx+(40*(i-1))-3;
						py3[i]=dy+(40*(i-1))-9;
					}
					if(i==10)
					{
						px3[i]=dx+(40*(i-1))-3;
						py3[i]=dy+(40*(i-1))+11;
					}
					if(i==12)
					{
						px3[i]=dx+(40*(i-1))-3;
						py3[i]=dy+(40*(i-1))-11;
					}
				}
				
				circ.add(i,new Circle(px3[i],py3[i],8.5,Color.CADETBLUE));
				tx1.add(i,new Text((px3[i]-4),(py3[i]+3),String.valueOf(i+1)));
				group3.getChildren().addAll(circ.get(i),tx1.get(i));
				
			}
			stg.setScene(bfsscene);
		}
		
		if(e.getSource()==ctg)
		{
			for(int i=1;i<=non;i++)
			{
				for(int j=1;j<=non;j++)
				{
					if(input2[i][j]==1)
					{
						lin.add(k,new Line(circ.get(i-1).getCenterX(),circ.get(i-1).getCenterY(),circ.get(j-1).getCenterX(),circ.get(j-1).getCenterY()));
						group3.getChildren().add(lin.get(k));
						k++;
					}
				}
			}
			stg.setScene(bfsscene);
		}
	
		if(e.getSource()==tra)
		{
			
			queue = new LinkedList<Integer>();
			String sb3=tf3.getText();
			src=Integer.parseInt(sb3);
			
			visited = new int[non + 1];
			level = new int[non + 1];
			
			Thread z1=new Thread(new Runnable(){

				@Override
				public void run() {
					int i, element;
					visited[src]=1;
					level[src]=0;
					queue.add(src);
					Animate2(circ.get(src-1), circ.get(src-1),level[src]);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("Removal list: ");
					while(!queue.isEmpty())
					{
						element=queue.remove();
						System.out.print(element+" ");
						for(i=1;i < input2[element].length; i++)
						{
							int adn=input2[element][i];
							if(adn==1 && visited[i]==0)
							{
								queue.add(i);
								visited[i]=1;
								level[i] = level[element] + 1;
								Animate2(circ.get(i-1),circ.get(element-1),level[i]);
								
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
								
							}
						}
					}
					
					
				}
	        	
	        });
	        z1.start();
			
		}
		if(e.getSource()==b3)
		{
			bfspane=new GridPane();
			bfspane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			bfsscene=new Scene(bfspane,1400,700);
			group3=new Group();
			l4=new Label();
			l4.setText("Number of nodes(max. 13):");
			l4.relocate(100, 100);
			tf1=new TextField();
			tf1.relocate(250, 100);
			l5=new Label();
			l5.setText("Enter the Array:");
			l5.relocate(100, 150);
			tf2=new TextField();
			tf2.relocate(250, 150);
			l6=new 	Label();
			l6.setText("Source:");
			l6.relocate(100, 200);
			tf3=new TextField();
			tf3.relocate(250, 200);

			b3=new Button();
			b3.setText("Return");
			b3.setPrefWidth(90);
			b3.setPrefHeight(40);
			b3.relocate(1100, 600);
			ex3=new Button();
			ex3.setText("Exit");
			ex3.setPrefWidth(90);
			ex3.setPrefHeight(40);
			ex3.relocate(1200, 600);
			stn=new Button();
			stn.setText("Show the Nodes");
			stn.setPrefHeight(40);
			stn.relocate(100, 250);
			ctg=new Button();
			ctg.setText("Construct the Graph");
			ctg.setPrefHeight(40);
			ctg.relocate(100, 320);
			tra=new Button();
			tra.setText("Traverse");
			tra.setPrefHeight(40);
			tra.relocate(100, 390);
			
			group3.getChildren().addAll(l4,l5,l6,tf1,tf2,tf3,stn,ctg,tra,b3,ex3);
			bfsscene=new Scene(group3,1400,700);
			stn.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			ctg.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			tra.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			b3.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			ex3.setOnAction((ActionEvent e1) -> {
				ButtonClicked(e1);
			});
			stg.setScene(scene);
			stg.setTitle("ALGORITHM SIMULATOR");
		}
		if(e.getSource()==ex3)
		{
		  System.exit(0);
		}
		
		if(e.getSource()==dfs)
		{
			stg.setTitle("DEPTH FIRST SEARCH");
			stg.setScene(dfsscene);
		}
		
		if(e.getSource()==stn1)
		{
			group4.getChildren().removeAll(circ1);
			group4.getChildren().removeAll(lin1);
			group4.getChildren().removeAll(tx2);
			

			String sb3=tf7.getText();
			non1=Integer.parseInt(sb3);
			
			
			input3=new int[non1+1][non1+1];
			px4=new double[non1];
			py4=new double[non1];
			
			String sb4=tf8.getText();
			String sb5[]=sb4.split(" ");
			
			for(int i=1;i<=non1;i++)
			{
				for(int j=1;j<=non1;j++)
				{
					int ns1=(j-1)+(non1*(i-1));
					input3[i][j]=Integer.parseInt(sb5[ns1]);
				}
			}
			
			for(int i=0;i<non1;i++)
			{
				if(i==0)
				{
					px4[i]=dx1;
					py4[i]=dy1-50;				
				}
				
				else if((i%2)==1)
				{
					if(i==1)
					{
						px4[i]=dx1-(40*i)+3;
						py4[i]=dy1+(40*i)+10;
					}
					if(i==3)
					{
						px4[i]=dx1-(40*i)+3;
						py4[i]=dy1+(40*i)-10;
					}
					if(i==5)
					{
						px4[i]=dx1-(40*i)+3;
						py4[i]=dy1+(40*i)+9;
					}
					if(i==7)
					{
						px4[i]=dx1-(40*i)+3;
						py4[i]=dy1+(40*i)-9;
					}
					if(i==9)
					{
						px4[i]=dx1-(40*i)+3;
						py4[i]=dy1+(40*i)+11;
					}
				}
				
				else if((i%2)==0)
				{
					if(i==2)
					{
						px4[i]=dx1+(40*(i-1))-3;
						py4[i]=dy1+(40*(i-1))+10;
					}
					if(i==4)
					{
						px4[i]=dx1+(40*(i-1))-3;
						py4[i]=dy1+(40*(i-1))-10;
					}
					if(i==6)
					{
						px4[i]=dx1+(40*(i-1))-3;
						py4[i]=dy1+(40*(i-1))+9;
					}
					if(i==8)
					{
						px4[i]=dx1+(40*(i-1))-3;
						py4[i]=dy1+(40*(i-1))-9;
					}
					if(i==10)
					{
						px4[i]=dx1+(40*(i-1))-3;
						py4[i]=dy1+(40*(i-1))+11;
					}
				}
				
				circ1.add(i,new Circle(px4[i],py4[i],8.5,Color.CADETBLUE));
				tx2.add(i,new Text((px4[i]-4),(py4[i]+3),String.valueOf(i+1)));
				group4.getChildren().addAll(circ1.get(i),tx2.get(i));
				
			}
			stg.setScene(dfsscene);
		}
		
		if(e.getSource()==ctg1)
		{
			for(int i=1;i<=non1;i++)
			{
				for(int j=1;j<=non1;j++)
				{
					if(input3[i][j]==1)
					{
						lin1.add(k1,new Line(circ1.get(i-1).getCenterX(),circ1.get(i-1).getCenterY(),circ1.get(j-1).getCenterX(),circ1.get(j-1).getCenterY()));
						group4.getChildren().add(lin1.get(k1));
						k1++;
					}
				}
			}
			stg.setScene(dfsscene);
		}
		
		if(e.getSource()==tra1)
		{
			stack = new Stack<Integer>();
			String sb6=tf9.getText();
			src1=Integer.parseInt(sb6);
			
			visited1 = new int[non1 + 1];
			level1 = new int[non1 + 1];
			
			Thread z5=new Thread(new Runnable(){

				@Override
				public void run() {
					int i1, element1;
					i1=src1;
					element1=src1;
					visited1[src1]=1;
					level1[src1]=0;
					stack.push(src1);
					Animate3(circ1.get(src1-1), circ1.get(src1-1),level1[src1]);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					while (!stack.isEmpty()) {
	                    element1 = stack.peek();
	                    i1 = 1;

	                    while (i1 <= non1) {
	                        if (input3[element1][i1] == 1 && visited1[i1]==0) {
	                            stack.push(i1);
	                            level1[i1] = level1[element1] + 1;
	                            Animate3(circ1.get(i1-1), circ1.get(element1-1),level1[i1]);
	                            visited1[i1] = 1;
	                            element1 = i1;
	                            i1 = 1;
	                            try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
	                            continue;
	                        }
	                        i1++;
	                    }
	                    stack.pop();
	                }
					
				}
				
			});
			z5.start();
		}
		
		if(e.getSource()==b4)
		{
			dfspane=new GridPane();
			dfspane.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			dfsscene=new Scene(dfspane,1400,700);
			group4=new Group();
			l13=new Label();
			l13.setText("Number of nodes:");
			l13.relocate(100, 100);
			tf7=new TextField();
			tf7.relocate(250, 100);
			l14=new Label();
			l14.setText("Enter the Array:");
			l14.relocate(100, 150);
			tf8=new TextField();
			tf8.relocate(250, 150);
			l15=new 	Label();
			l15.setText("Source:");
			l15.relocate(100, 200);
			tf9=new TextField();
			tf9.relocate(250, 200);
			
			
			stn1=new Button();
			stn1.setText("Show the Nodes");
			stn1.relocate(100, 250);
			ctg1=new Button();
			ctg1.setText("Construct the Graph");
			ctg1.relocate(100, 320);
			tra1=new Button();
			tra1.setText("Traverse");
			tra1.relocate(100, 390);
			b4=new Button();
			b4.setText("Return");
			b4.setPrefWidth(90);
			b4.setPrefHeight(40);
			b4.relocate(1100, 600);
			ex4=new Button();
			ex4.setText("Exit");
			ex4.setPrefWidth(90);
			ex4.setPrefHeight(40);
			ex4.relocate(1200, 600);
			
			
			group4.getChildren().addAll(l13,l14,l15,tf7,tf8,tf9,stn1,ctg1,tra1,b4,ex4);
			dfsscene=new Scene(group4,1400,700);
			stn1.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			ctg1.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			tra1.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			b4.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			ex4.setOnAction((ActionEvent e4) -> {
				ButtonClicked(e4);
			});
			stg.setScene(scene);
			stg.setTitle("ALGORITHM SIMULATOR");
		}
		
		if(e.getSource()==ex4)
		{
			System.exit(0);
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void run() {
		System.out.println("Running here");
		
	}
	
	public void CHeight(int[] n)
	{
		int max=n[0];
		
		height=new double[n.length];
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
			
		}
		
		System.out.println("The heights are: ");
		for(int j=0;j<n.length;j++)
		{
			height[j]=(double)(250.0/max)*(double)(n[j]);
			System.out.print(height[j]+"  ");
		}
	}
	
	void swap(Rectangle r1,Rectangle r2)
	{
		Rectangle t=new Rectangle();
		t=r1;
		r1=r2;
		r2=t;
	}
	
	void swap(int a,int b)
	{
		int t=a;
		a=b;
		b=t;
	}
	
	synchronized void Animate(int i,int j)
	{
		Thread t1=new Thread(new Runnable(){
			
			public void run()
			{
				TranslateTransition tt1=new TranslateTransition();
				TranslateTransition tt2=new TranslateTransition();
				
				double x1=rect.get(i).getTranslateX();
				double x2=rect.get(j).getTranslateX();
				
				System.out.println("Moving from: "+x1+" to "+x2);
				
				tt1.setNode(rect.get(i));
				tt1.setDuration(Duration.millis(1000));
				tt1.setToX(x2);
				
				tt2.setNode(rect.get(j));
				tt2.setDuration(Duration.millis(1000));
				tt2.setToX(x1);
				
				p.getChildren().addAll(tt1,tt2);
				p.play();
			}
			
		});
		
		t1.start();
	}
	
	synchronized void Animate1(int x, int y)
	{
		Thread t3=new Thread(new Runnable(){

			@Override
			public void run() {
				
				for(int j=x;j<=y;j++)
				{
					rect1.get(j).setFill(Color.DARKCYAN);
				}
				
			}
			
		});
		t3.start();
		
		
	}
	
	synchronized void Animate2(Circle c1,Circle c2,int l)
	{
		Thread z2 = new Thread(new Runnable() {
            @Override
            public void run() {
            	FillTransition ft = new FillTransition(Duration.millis(2000), c1, Color.RED, (Color) color[l]);
                ScaleTransition st = new ScaleTransition(Duration.millis(1000), c1);
                st.setByX(1.1f);
                st.setByY(1.1f);
                st.setAutoReverse(true);
                st.setCycleCount(2);
                ft.play();
                st.play();
                Line line= new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
                line.setStrokeWidth(3);
                line.getStrokeDashArray().addAll(5d, 5d, 5d, 5d, 5d);
                line.setStrokeDashOffset(9);
                line.setStrokeLineCap(StrokeLineCap.SQUARE);
               ft.setOnFinished(event -> group3.getChildren().add(line));
                
            }
        });
		z2.start();
	}
	
	synchronized void Animate3(Circle c1,Circle c2,int l)
	{
		Thread z6=new Thread(new Runnable(){

			@Override
			public void run() {
				FillTransition ft = new FillTransition(Duration.millis(2000), c1, Color.RED, (Color) color1[l]);
                ScaleTransition st = new ScaleTransition(Duration.millis(1000), c1);
                st.setByX(1.1f);
                st.setByY(1.1f);
                st.setAutoReverse(true);
                st.setCycleCount(2);
                ft.play();
                st.play();
                Line line= new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
                line.setStrokeWidth(3);
                line.getStrokeDashArray().addAll(5d, 5d, 5d, 5d, 5d);
                line.setStrokeDashOffset(9);
                line.setStrokeLineCap(StrokeLineCap.SQUARE);
                ft.setOnFinished(event -> group4.getChildren().add(line));
            
			}
			
		});
		z6.start();
	}
	
	synchronized void Highlight(Rectangle r)
	{
		Thread z3=new Thread(new Runnable(){

			@Override
			public void run() {
				FillTransition f1=new FillTransition(Duration.millis(4000),r,Color.BLUEVIOLET,Color.DARKCYAN);
				f1.play();
				
			}
			
		});
		z3.start();
	}
	synchronized void Highlight1(Rectangle r,Rectangle r1)
	{
		Thread z7=new Thread(new Runnable(){

			@Override
			public void run() {
				FillTransition fk1=new FillTransition(Duration.millis(1500),r,Color.YELLOW,Color.CADETBLUE);
				FillTransition fk2=new FillTransition(Duration.millis(1500),r1,Color.YELLOW,Color.CADETBLUE);
				fk1.play();
				fk2.play();
				
			}
			
		});
		z7.start();
	}
	
	synchronized void Highlight2(Rectangle r,Rectangle r1)
	{
		Thread z8=new Thread(new Runnable(){

			@Override
			public void run() {
				FillTransition fk1=new FillTransition(Duration.millis(1500),r,Color.DARKRED,Color.CADETBLUE);
				FillTransition fk2=new FillTransition(Duration.millis(1500),r1,Color.DARKRED,Color.CADETBLUE);
				fk1.play();
				fk2.play();
				
			}
			
		});
		z8.start();
	}
	
	
}
