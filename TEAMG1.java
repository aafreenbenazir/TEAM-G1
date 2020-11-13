// TEAM G1
package team.g1;
//importing packages
import java.awt.Button;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class TEAMG1 {

   
    public static void main(String[] args) {
        jewel obj=new jewel();
        obj.display1();
    }
    
}
class jewel
{
    JFrame f3;
    JLabel l,l2;
    Font f4;
    JButton b;
        void display1()
        {
           f3=new JFrame();
           l=new JLabel("JEWELLERY BASED");
           
           l.setBounds(0,180,400,30);
           
           l2=new JLabel("SHOPPING APPLICATION");
           
           l2.setBounds(0,200,400,30);
           f4=new Font("TIMES ROMAN",Font.CENTER_BASELINE,32);
           l.setFont(f4);
           l2.setFont(f4);
           l.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
            //System.out.println("hi");
        login obj=new login();
        obj.getdetails();
        f3.dispose();
        }
        });

           f3.add(l);
           f3.add(l2);
           f3.setSize(500,500);
           f3.setVisible(true);
           f3.setLayout(null);
           f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
class login  implements ActionListener  
{
    JFrame f;
    JTextField t1,t2;
    void getdetails()
    {
    f = new JFrame();
    
    JLabel l1=new JLabel("Jewellery Based Shopping System");
    l1.setBounds(150,50,1000,30);
    JLabel l2=new JLabel("USERNAME");
    l2.setBounds(100,110,100,30);
    JLabel l3=new JLabel("PASSWORD");
    l3.setBounds(100,150,100,30);
    t1=new JTextField();
    t1.setBounds(200,110,100,30);
    t2=new JTextField();
    t2.setBounds(200,150,100,30);
    Button b1=new Button("LOG IN");
    b1.setBounds(170,200,90,30);
    JLabel l4= new JLabel("create a new account");
    l4.setBounds(140,250,150,30);
    
    
    l4.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e2 ){
    f.dispose();
    signup obj1= new signup();
    obj1.getdetails();
    }} );
    b1.addActionListener(this);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(t1);
    f.add(t2);
    f.add(b1);
    f.add(l4);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.getDefaultCloseOperation();
    }

    
    public void actionPerformed(ActionEvent e) {
        String a=t1.getText();
        String b=t2.getText();
        int flag=0;
        
   try
   {
   BufferedReader fil = new   BufferedReader( new FileReader("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\cust.txt"));
   String r;
   int i=0;
   while((r=fil.readLine())!=null)
   {
       if(i%2==0)
       {
           if(a.equals(r))
           {
               
               if(b.equals(fil.readLine()))
               {
                   flag =1;
                   page1 obj4=new page1();
                   obj4.buttonslist();
               }
              
               i++;
            }
       }
       i++; 
   } 
   fil.close();
         if(flag==0)
         {
            JOptionPane.showMessageDialog(null,"Username or password wrong");
         }
   
    }
        catch(Exception e1)
        {
            
        }
        
    }
    

}
class signup  implements ActionListener
{
    JFrame f;
    JTextField t1,t2,t3;
    void getdetails()
    {
    f = new JFrame();
    JLabel l1=new JLabel("Jewellery Based Shopping System");
    l1.setBounds(150,50,1000,30);
    JLabel l2=new JLabel("USERNAME");
    l2.setBounds(100,110,100,30);
    JLabel l3=new JLabel("PASSWORD");
    l3.setBounds(100,200,100,30);
    JLabel l6=new JLabel("(NOTE :: password box should  first contain the username");
    l6.setBounds(50,150,1000,30);
    JLabel l7=new JLabel("then the password followed by username)");
    l7.setBounds(130,170,1000,30);
    JLabel l5 = new JLabel("confirm password");
    l5.setBounds(100,250,150,30);
    t1=new JTextField();        //TextField for user name
    t1.setBounds(220,110,100,30);
    t2=new JTextField();        //TextField for password
    t2.setBounds(220,200,100,30);
    t3=new JTextField();        //TextField for confirm password
    t3.setBounds(220,250,100,30);
    Button b1=new Button("SIGN UP");
    b1.setBounds(170,290,90,30);
    b1.addActionListener(this);
    JLabel l4= new JLabel("already a user");//To go to the previous frame 
    l4.setBounds(160,340,150,30);
    l4.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e2 ){
    f.dispose();
    login obj3 = new login();
    obj3.getdetails();
    }} );
    //Adding to the frame
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(t1);
    f.add(t2);
    f.add(b1);
    f.add(t3);
    f.add(l4);
    f.add(l5);
    f.add(l6);
    f.add(l7);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.getDefaultCloseOperation();
    }

    
    public void actionPerformed(ActionEvent e) {
        try{
       BufferedWriter fil = new BufferedWriter( new FileWriter("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\cust.txt",true));
       String a=t1.getText();
       String b = t2.getText();
       String c = t3.getText();
       int a1=a.length();
       String u = b.substring(0,a1);
       
      if(u.equals(a))
       {
       if(b.equals(c))
       {
          fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
          
          fil.close();
           JOptionPane.showMessageDialog(null,"Account Created");
           page1 obj4=new page1();
           obj4.buttonslist();
       }
       else
       {
           JOptionPane.showMessageDialog(null,"PASSWORD and CONFIRM PASSWORD should match!!!");
       }
       }
        else
        {
       JOptionPane.showMessageDialog(null,"password box violates the contrain!!");
        }
        
        }
        
        catch(Exception e5)
        {
            
        }
        
    }
  
      
  
}
class page1 implements ActionListener
{
    public JButton finder,cat,scheme,cart;
    JFrame f;
    JLabel l1;
    void buttonslist()
    {
        f= new JFrame();
         finder = new JButton("Rate Finder");
        finder.setBounds(200,100,100,30);
         cat = new JButton("Catalogue");
        cat.setBounds(200,170,100,30);
         scheme =new JButton("schemes");
        scheme.setBounds(200,240,100,30);
         cart = new JButton("Cart");
        cart.setBounds(200,310,100,30);
        finder.addActionListener(this);
        cat.addActionListener(this);
        scheme.addActionListener(this);
        cart.addActionListener(this);
        f.add(cart);
        f.add(finder);
        f.add(scheme);
        f.add(cat);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.getDefaultCloseOperation();
        l1=new JLabel("Log Out");
        l1.setBounds(410,0,100,30);
        l1.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e2 ){
    f.dispose();
    login obj3 = new login();
    obj3.getdetails();
    }} );
        f.add(l1);
        

     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource()== finder)
       {
           ratefinder obj5 = new ratefinder();
           obj5.rate();
           
       }
       else if(e.getSource()==scheme)
       {
           scheme1 obj8=new scheme1();
           obj8.saving();
       }
       else if(e.getSource()==cat)
       {
           cata obj10=new cata();
           obj10.dis();
       }
       else if(e.getSource()==cart)
       {
           bill obj11=new bill();
           obj11.cart();
       }
      
    }
}

class ratefinder implements ActionListener
{
    int flag =0;
    JFrame f;
    JTextField t2,t3;
    
    JComboBox c;
    public void rate()
    {
        
     f=new JFrame();
     JLabel l=new JLabel("RATE FINDER");
    l.setBounds(150,50,1000,30);
    JLabel l1=new JLabel("Enter the Type of precious metal/stone");
    l1.setBounds(30,150,1000,30);
    JLabel l2=new JLabel("Enter date");
    l2.setBounds(30,220,1000,30);
    Button b1=new Button("SEARCH");
    b1.setBounds(150,270,100,30);
    b1.addActionListener(this);
            
    JLabel l3=new JLabel("Cost per gram");
    l3.setBounds(90,330,1000,30);
   // t1=new JTextField();        
    //t1.setBounds(220,200,100,30);
    t2=new JTextField();        
    t2.setBounds(300,220,100,30);
    t3=new JTextField();        
    t3.setBounds(200,330,100,30);
    t2.setText("");
    t3.setText("");
    String s []={"Gold","Diamond","Silver"};
    c=new JComboBox(s);
    c.setBounds(300,150,100,30);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(t2);
    f.add(t3);
    f.add(c);
    f.add(b1);
    f.add(l);
     f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.getDefaultCloseOperation();
    
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String b = t2.getText();
        String a=(String) c.getItemAt(c.getSelectedIndex());
        

     try
     {      
         if(a.equals("Gold"))
       {
            
           BufferedReader f2= new BufferedReader( new FileReader‪("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gol.txt"));
             String r;
             
             while((r=f2.readLine())!=null)
             {
                 String d= r.substring(0, 10);
                 
                 if(b.equals(d))
                 {                     
                     String t =r.substring(11);
                     t3.setText(t);
                     flag =0;
                     break;
                     
                 }
                   else
                 {
                   flag =1;
                 }
                 
                 
              }
             if(flag==1)
             {
                 JOptionPane.showMessageDialog(null,"Information has not been updated!!!");
             }
             else
             {
                 
             }
         
            f2.close();
            
        }
           
           
       else if (a.equals("Diamond"))
       {
        BufferedReader fil = new   BufferedReader( new FileReader("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia.txt"));
           
             String r;
             while((r=fil.readLine())!=null)
             {
                  String d= r.substring(0, 10);
                 if(b.equals(d))
                 {
                     String t =r.substring(11);
                     t3.setText(t);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Information has not been updated!!!");
                 }
             }
             fil.close();
       }         
       else if(a.equals("Silver"))
       {
        BufferedReader fil = new   BufferedReader( new FileReader("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil.txt"));
             String r;
             while((r=fil.readLine())!=null)
             {
                  String d= r.substring(0, 10);
                 if(b.equals(d))
                 {
                     String t =r.substring(11);
                     t3.setText(t);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Information has not been updated!!!");
                 }
 
              }
            fil.close();
            f.dispose();
       }  
         
       }
        catch(Exception e7)
        {
            
        
        }
    }
    
    
}




class scheme1 implements ActionListener
{
    JFrame f;
    JComboBox c;
    JButton b;
    JLabel q,l2,l3;
    JTextField t;
    void saving()
    {
        f=new JFrame();
     q =new JLabel("Select scheme");
    q.setBounds(200,200,100,30);
    q.setText("");
    String s[]={"Gold Scheme", "Silver Scheme", "Diamond Scheme"};
    c=new JComboBox(s);
    c.setBounds(130,100,150,30);

    b=new JButton("SEARCH");
    b.setBounds(300,100,100,20);
    b.addActionListener(this);
    t=new JTextField();
    t.setBounds(50,150,350,150);
     l2=new JLabel("Do you want to pay a scheme?");
     l2.setBounds(130,300,500,30);
    l3=new JLabel("only already opted scheme can be paid online");
    l3.setBounds(210,20,1000,30);
    l2.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e3 ){
       
        
    scheme2 obj9=new scheme2();
    obj9.saving2();
   f.dispose();
    }} );
    f.add(q);
    f.add(t);
    f.add(b);
    f.add(c);
    f.add(l2);
    f.add(l3);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.getDefaultCloseOperation();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a=(String) c.getItemAt(c.getSelectedIndex());
        if(a.equals("Gold Scheme"))
        {
            String d = "Invest an amount of 1000 for 10 months in Gold Scheme.";
             t.setText(d);
        }
        else if(a.equals("Silver Scheme"))
        {
           String d = "Invest an amount of 500 for 11 months in Silver Scheme";
             t.setText(d); 
        }
        else if(a.equals("Diamond Scheme"))
        {
           String d = "Invest an amount of 5000 for 15 months in Diamond Scheme.";
             t.setText(d); 
        }

        
    }
}
class scheme2 implements ActionListener
{
    JFrame f;
    
    JTextField t, t1, t2;
    JLabel l3,l4,l5,l6;

  
    void saving2()
    {
        

         f=new JFrame();
        l6=new JLabel("Back to DESCRIPTION");
        l6.setBounds(200,0,800,30);
        l3=new JLabel("Account Name");
        l3.setBounds(100,100,100,30);
        t=new JTextField();
        t.setBounds(200,100,100,30);
        l4=new JLabel("Account No");
        l4.setBounds(100,150,100,30);
        t1=new JTextField();
        t1.setBounds(200,150,100,30);
        l5=new JLabel("Phone No");
        l5.setBounds(100,200,100,30);
        t2=new JTextField();
        t2.setBounds(200,200,100,30);
        JButton b=new JButton("PAY");
        b.setBounds(200,250,100,30);
        f.add(l3);
        f.add(l6);
        f.add(t);
        f.add(l4);
        f.add(t1);
        f.add(l5);
        f.add(t2);
        f.add(b);
        l6.addMouseListener(new MouseAdapter() {

  
    public void mouseClicked(MouseEvent e) {
            System.out.println("hi");
        scheme1 obj= new scheme1();
        obj.saving();
        f.dispose();
        
        }
        });
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.getDefaultCloseOperation();

       

       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       f.dispose();
    }
}


class cata implements ActionListener
{
    JFrame f;
    JButton  b;
    JComboBox c;
    String link="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\cartThings.txt";
    void dis()
    {
    f=new JFrame();
    String s []={"Gold","Diamond","Silver"};
    c=new JComboBox(s);
    c.setBounds(300,150,100,30);
    b=new JButton("Search");
    b.setBounds(100,150,100,30);
   b.addActionListener(this);
   
     f.add(c);
    f.add(b);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.getDefaultCloseOperation();

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String a=(String) c.getItemAt(c.getSelectedIndex());
        if(a.equals("Gold"))
        {
            catagold obj11=new catagold();
            obj11.display();
            
        }
        else if(a.equals("Diamond"))
        {
            catadia obj13=new catadia();
            obj13.display();
        }
        else if(a.equals("Silver"))
        {
            catasil obj15=new catasil();
            obj15.display();
        }
    
    }
}
class catagold implements ActionListener
{
    JFrame f1,f2;
    JButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    String link="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\cartThings.txt";

 void display()
    {
    f1=new JFrame();
    b1=new JButton();
    b1.setBounds(0,0,250,166);
    b1.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 1.jpg"));
    
    b1.addActionListener(this);
    f1.add(b1);
    //Button 3
    b3=new JButton();
    b3.setBounds(0,166,250,166);
    b3.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 2.jpg"));
    b3.addActionListener(this);
    f1.add(b3);
    //button 5
    b5=new JButton();
    b5.setBounds(0,332,250,166);
    b5.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 3.jpg"));
    b5.addActionListener(this);
    f1.add(b5);
    //button 7
    b7=new JButton();
    b7.setBounds(250,0,250,166);
    b7.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 4.jpg"));
    b7.addActionListener(this);
    f1.add(b7);
    //button 9
     b9=new JButton();
    b9.setBounds(250,166,250,166);
    b9.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 5.jpg"));
    b9.addActionListener(this);
    f1.add(b9);
    //button 11
     b11=new JButton();
    b11.setBounds(250,332,250,166);
    b11.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 10.jpg"));
    b11.addActionListener(this);
    f1.add(b11);



    f1.setSize(500,500);
    f1.setLayout(null);
    f1.setVisible(true);
    f1.getDefaultCloseOperation();
    
    
    
    
    }
   void first()
   {
        f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 1.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

           
            b2 =new JButton("Add to Cart");
            b2.setBounds(20,400,100,30);
            b2.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b2);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
    
   }
   void second()
   {
        f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
                    BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 2.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

           
            b4 =new JButton("Add to Cart");
            b4.setBounds(20,400,100,30);
            b4.addActionListener(this);
            JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);
            f2.add(l1);
            f2.add(b4);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
   }
   void third()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 3.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            
            b6 =new JButton("Add to Cart");
            b6.setBounds(20,400,100,30);
            b6.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b6);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
   
   }
   void fourth()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 4.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

           
            b8 =new JButton("Add to Cart");
            b8.setBounds(20,400,100,30);
            b8.addActionListener(this); 
            JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b8);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 
   }
   void fifth()
   {
      f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 5.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

           
            b10 =new JButton("Add to Cart");
            b10.setBounds(20,400,100,30);
            b10.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b10);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 
 
   }
   void sixth()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 10.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

           
            b12 =new JButton("Add to Cart");
            b12.setBounds(20,400,100,30);
            b12.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b12);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 

   }
    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
        if(e.getSource()== b1)
        {
            
           catagold obj12=new catagold();
           obj12.first();
           
           
        }
         else if(e.getSource()==b2)
        {   
         BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 1.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();
        }
         else if(e.getSource()==b3)
         {
             catagold obj12=new catagold();
           obj12.second();
         }
        else if(e.getSource()==b4)
        {   
            
         BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 2.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();
        }
        else if(e.getSource()==b5)
        {
             catagold obj12=new catagold();
           obj12.third();

        }
        else if(e.getSource()==b6)
        {
           BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 3.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  
        }
        else if(e.getSource()==b7)
        {
             catagold obj12=new catagold();
           obj12.fourth();


        }
        else if(e.getSource()==b8)
        {
             BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 4.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

        }
          else if(e.getSource()==b9)
                 {
                  catagold obj12=new catagold();
           obj12.fifth();

                 }
          else if(e.getSource()==b10)
                 {
                 BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 5.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

                 }
          else if(e.getSource()==b11)
                 {
                  catagold obj12=new catagold();
           obj12.sixth();

                 }
          else if(e.getSource()==b12)
                 {
                 BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\gold 10.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

                 }
        
        }
        catch(Exception e11)
        {
            
        }
            }
}
class catadia implements ActionListener
{
   JFrame f1,f2;
    JButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    
String link="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\cartThings.txt";
 void display()
    {
    f1=new JFrame();
    b1=new JButton();
    b1.setBounds(0,0,250,166);
    b1.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 1.jpg"));
    
    b1.addActionListener(this);
    f1.add(b1);
    //Button 3
    b3=new JButton();
    b3.setBounds(0,166,250,166);
    b3.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 2.jpg"));
    b3.addActionListener(this);
    f1.add(b3);
    //button 5
    b5=new JButton();
    b5.setBounds(0,332,250,166);
    b5.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 3.jpg"));
    b5.addActionListener(this);
    f1.add(b5);
    //button 7
    b7=new JButton();
    b7.setBounds(250,0,250,166);
    b7.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 4.jpg"));
    b7.addActionListener(this);
    f1.add(b7);
    //button 9
     b9=new JButton();
    b9.setBounds(250,166,250,166);
    b9.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 5.jpg"));
    b9.addActionListener(this);
    f1.add(b9);
    //button 11
     b11=new JButton();
    b11.setBounds(250,332,250,166);
    b11.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 6.jpg"));
    b11.addActionListener(this);
    f1.add(b11);



    f1.setSize(500,500);
    f1.setLayout(null);
    f1.setVisible(true);
    f1.getDefaultCloseOperation();
    
    
    
    
    }
   void first()
   {
        f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 1.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));
            b2 =new JButton("Add to Cart");
            b2.setBounds(20,400,100,30);
            b2.addActionListener(this);
             JLabel l2=new JLabel("30 carat");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b2);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
    
   }
   void second()
   {
        f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 2.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));
            b4 =new JButton("Add to Cart");
            b4.setBounds(20,400,100,30);
            b4.addActionListener(this);
            JLabel l2=new JLabel("30 carat");
            l2.setBounds(400,400,100,30);
            f2.add(l2);
            f2.add(l1);
            f2.add(b4);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
   }
   void third()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 3.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

           
            b6 =new JButton("Add to Cart");
            b6.setBounds(20,400,100,30);
            b6.addActionListener(this);
             JLabel l2=new JLabel("30 carat");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b6);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
   
   }
   void fourth()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 4.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

          
            b8 =new JButton("Add to Cart");
            b8.setBounds(20,400,100,30);
            b8.addActionListener(this); 
            JLabel l2=new JLabel("30 carat");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b8);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 
   }
   void fifth()
   {
      f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 5.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            
            b10 =new JButton("Add to Cart");
            b10.setBounds(20,400,100,30);
            b10.addActionListener(this);
             JLabel l2=new JLabel("30 carat");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b10);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 
 
   }
   void sixth()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 6.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            
            b12 =new JButton("Add to Cart");
            b12.setBounds(20,400,100,30);
            b12.addActionListener(this);
             JLabel l2=new JLabel("30 carat");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b12);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 

   }
    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
        if(e.getSource()== b1)
        {
            
           catadia obj12=new catadia();
           obj12.first();
           
           
        }
         else if(e.getSource()==b2)
        {   
         BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 1.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();
        }
         else if(e.getSource()==b3)
         {
             catadia obj12=new catadia();
           obj12.second();
         }
        else if(e.getSource()==b4)
        {   
            
         BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 2.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();
        }
        else if(e.getSource()==b5)
        {
             catadia obj12=new catadia();
           obj12.third();

        }
        else if(e.getSource()==b6)
        {
           BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 3.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  
        }
        else if(e.getSource()==b7)
        {
             catadia obj12=new catadia();
           obj12.fourth();


        }
        else if(e.getSource()==b8)
        {
             BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 4.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

        }
          else if(e.getSource()==b9)
                 {
                  catadia obj12=new catadia();
           obj12.fifth();

                 }
          else if(e.getSource()==b10)
                 {
                 BufferedWriter fil = new BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 5.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

                 }
          else if(e.getSource()==b11)
                 {
                  catadia obj12=new catadia();
           obj12.sixth();

                 }
          else if(e.getSource()==b12)
                 {
                 BufferedWriter fil = new  BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\dia 6.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

                 }
        
        }
        catch(Exception e11)
        {
            
        }
            }

}
class catasil  implements ActionListener
{
   JFrame f1,f2;
    JButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    
String link="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\cartThings.txt";
 void display()
    {
    f1=new JFrame();
    b1=new JButton();
    b1.setBounds(0,0,250,166);
    b1.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 1.jpg"));
    
    b1.addActionListener(this);
    f1.add(b1);
    //Button 3
    b3=new JButton();
    b3.setBounds(0,166,250,166);
    b3.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 2.jpg"));
    b3.addActionListener(this);
    f1.add(b3);
    //button 5
    b5=new JButton();
    b5.setBounds(0,332,250,166);
    b5.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 3.jpg"));
    b5.addActionListener(this);
    f1.add(b5);
    //button 7
    b7=new JButton();
    b7.setBounds(250,0,250,166);
    b7.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 4.jpg"));
    b7.addActionListener(this);
    f1.add(b7);
    //button 9
     b9=new JButton();
    b9.setBounds(250,166,250,166);
    b9.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 6.jpg"));
    b9.addActionListener(this);
    f1.add(b9);
    //button 11
     b11=new JButton();
    b11.setBounds(250,332,250,166);
    b11.setIcon(new ImageIcon("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 7.jpg"));
    b11.addActionListener(this);
    f1.add(b11);



    f1.setSize(500,500);
    f1.setLayout(null);
    f1.setVisible(true);
    f1.getDefaultCloseOperation();
    
    
    
    
    }
   void first()
   {
        f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 1.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            
            b2 =new JButton("Add to Cart");
            b2.setBounds(20,400,100,30);
            b2.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b2);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
    
   }
   void second()
   {
        f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 2.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            
            b4 =new JButton("Add to Cart");
            b4.setBounds(20,400,100,30);
            b4.addActionListener(this);
            JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);
            f2.add(l1);
            f2.add(b4);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
   }
   void third()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 3.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            b6 =new JButton("Add to Cart");
            b6.setBounds(20,400,100,30);
            b6.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b6);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation();
   
   }
   void fourth()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 4.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

           
            b8 =new JButton("Add to Cart");
            b8.setBounds(20,400,100,30);
            b8.addActionListener(this); 
            JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b8);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 
   }
   void fifth()
   {
      f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 5.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            
            b10 =new JButton("Add to Cart");
            b10.setBounds(20,400,100,30);
            b10.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b10);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 
 
   }
   void sixth()
   {
       f2=new JFrame();
            JLabel l1 =new JLabel();
            l1.setBounds(0,0,500,500);
            BufferedImage w = null;
            try
            {
                w=ImageIO.read(new File("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 6.jpg"));
            }
            catch(Exception e20)
            {
                
            }
            Image w1=w.getScaledInstance(500,500, Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(w1));

            
            b12 =new JButton("Add to Cart");
            b12.setBounds(20,400,100,30);
            b12.addActionListener(this);
             JLabel l2=new JLabel("30 grams");
            l2.setBounds(400,400,100,30);
            f2.add(l2);

            f2.add(l1);
            f2.add(b12);
            f2.setSize(500,500);
            f2.setLayout(null);
            f2.setVisible(true);
            f2.getDefaultCloseOperation(); 

   }
    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
        if(e.getSource()== b1)
        {
            
           catasil obj12=new catasil();
           obj12.first();
           
           
        }
         else if(e.getSource()==b2)
        {   
         BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 1.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();
        }
         else if(e.getSource()==b3)
         {
             catasil obj12=new catasil();
           obj12.second();
         }
        else if(e.getSource()==b4)
        {   
            
         BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 2.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();
        }
        else if(e.getSource()==b5)
        {
             catasil obj12=new catasil();
           obj12.third();

        }
        else if(e.getSource()==b6)
        {
           BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 3.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  
        }
        else if(e.getSource()==b7)
        {
             catasil obj12=new catasil();
           obj12.fourth();


        }
        else if(e.getSource()==b8)
        {
             BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 4.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

        }
          else if(e.getSource()==b9)
                 {
                  catasil obj12=new catasil();
           obj12.fifth();

                 }
          else if(e.getSource()==b10)
                 {
                 BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 5.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

                 }
          else if(e.getSource()==b11)
                 {
                  catasil obj12=new catasil();
           obj12.sixth();

                 }
          else if(e.getSource()==b12)
                 {
                 BufferedWriter fil = new   BufferedWriter( new FileWriter(link,true));
         String a="C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\sil 6.jpg";
         String b="30";
         fil.write(a);
          fil.write("\r\n");
          fil.write(b);
          fil.write("\r\n");
         fil.close();  

                 }
        
        }
        catch(Exception e11)
        {
            
        }
            }
 
}
class bill extends cata implements ActionListener
{
 JFrame f;
 JButton[] b;
 JButton pay ,b8;
 JLabel[] price,grams;

 void cart()
 {
     f =new JFrame();
       pay=new JButton("Place order and buy");
       pay.setBounds(200,400,200,30);
       f.add(pay);
       pay.addActionListener(this);
     f.setSize(600,600);
     f.setLayout(null);
            f.setVisible(true);
            f.getDefaultCloseOperation();

     
     ArrayList<String> arr=new ArrayList<String>();
         ArrayList<Integer> arr1=new ArrayList<Integer>();
     try
     {
      BufferedReader fil = new  BufferedReader( new FileReader(link));
             String r;
             int i=0;
             int g;
             while((r=fil.readLine())!=null)
             {
                 
             	if(i%2==0)
             	{
                arr.add(r);
             	}
             	else
             	{
             		arr1.add(Integer.parseInt(r));
             	}

              //  JButton bi=new JButton("r"); 
                //g=Integer.parseInt(fil.readLine());
                i++;
             }
          fil.close();
          b = new JButton[i];
        
          price=new JLabel[i];
          grams=new JLabel[i];


        int k=0,m=0;
       
          for(int j=0;j<i;j++)
          {
              
             
          	b[j]=new JButton();
          	price[j]=new JLabel(""+((int)arr1.get(j))*5500);
          	grams[j]=new JLabel((int)arr1.get(j)+" grams");
          	b[j].setBounds(20+k,20,200,200);
          	k+=230;
          	b[j].setIcon(new ImageIcon(arr.get(j)));
            grams[j].setBounds(m+100,240,100,30);
          	price[j].setBounds(m+100,260,150,30);
m+=250;
f.add(b[j]);
f.add(price[j]);
f.add(grams[j]);
          }
          
          }
     catch(Exception e)
     {

     }
 }
 public void actionPerformed(ActionEvent e) 
 {
     if (e.getSource()==pay)
     {
     JFrame jf=new JFrame();
     
     JLabel name=new JLabel("Name");
     name.setBounds(100,120,100,30);
     JLabel address=new JLabel("Address");
     address.setBounds(100,160,100,30);
     JLabel phone=new JLabel("Phone");
     phone.setBounds(100,200,100,30);
     JLabel ac=new JLabel("Account number");
     ac.setBounds(100,240,100,30);
     b8=new JButton("Confirm Order");
     b8.setBounds(150,300,200,30);
     b8.addActionListener(this);
     JTextField t1,t2,t3,t4;
     t1=new JTextField("");
t2=new JTextField("");
t3=new JTextField("");
t4=new JTextField("");
t1.setBounds(150,120,200,30);
t2.setBounds(150,160,200,30);
t3.setBounds(150,200,200,30);
t4.setBounds(150,240,200,30);
jf.add(name);
jf.add(address);
jf.add(phone);
jf.add(ac);
jf.add(b8);
jf.add(t1);
jf.add(t2);
jf.add(t3);
jf.add(t4);
     jf.setSize(500,500);
     jf.setLayout(null);
     jf.setVisible(true);
     jf.getDefaultCloseOperation();
     }
     else if(e.getSource()==b8)
     {
          JOptionPane.showMessageDialog(null,"Order Placed");
          try
          {
          new FileWriter("C:\\Users\\hp.pc\\Documents\\NetBeansProjects\\TEAM G1\\src\\team\\g1\\cartThings.txt",false).close();
     }
          catch(Exception e21)
          {
              
          }
     }
 }
    
}
}
