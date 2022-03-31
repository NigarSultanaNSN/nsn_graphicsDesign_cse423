package cse_423_firstname;

/**
 *
 * @author Nigar Sultana
 */
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import java.lang.Math;
import javax.swing.JFrame;

class ThirdGLEventListener implements GLEventListener {
/**
 * Interface to the GLU library.
 */
private GLU glu;

/**
 * Take care of initialization here.
 */
public void init(GLAutoDrawable gld) {
    GL2 gl = gld.getGL().getGL2();
    glu = new GLU();

    gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    gl.glViewport(-250, -150, 250, 150);
    gl.glMatrixMode(GL2.GL_PROJECTION);
    gl.glLoadIdentity();
    glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
}

/**
 * Take care of drawing here.
 */
public void display(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glColor3f(255,0,0);

    gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

   //drawing 'N'
    gl.glBegin(GL2.GL_LINES);  
    gl.glVertex2d(-180, 85);  
    gl.glVertex2d(-180, -5);  
    gl.glVertex2d(-180, 85);  
    gl.glVertex2d(-130, -5);  
    gl.glVertex2d(-130, 85);  
    gl.glVertex2d(-130, -5);  
    gl.glEnd();
    
  //drawing 'i'


    gl.glBegin(GL2.GL_LINES);  
    gl.glVertex2d(-115, 85);  
    gl.glVertex2d(-115, 80);  
    gl.glVertex2d(-115, 50);  
    gl.glVertex2d(-115, -5);  
    gl.glEnd();
   
  //drawing 'g'
    int a=35;
    int b=20;
    int x=0;
    int y=b;
    int sftX=-70;
    int sftY=20;
    double d=b*b+a*a*(0.25-b);
    
    gl.glBegin(GL2.GL_POINTS);
    while(a*a*y>b*b*x){
        
        gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
        gl.glVertex2i(x+sftX, -y+sftY);
        gl.glVertex2i(-x+sftX, -y+sftY);
        if(d<0){
            d=d+b*b*(2*x+3);
            x++;
        }
        else{
            d=d+b*b*(2*x+3)+a*a*(-2*y+2);
            x++; y--;
        }
    }
    d=a*a+b*b*(0.25-a);
    x=a; y=0;
    while(b*b*x>a*a*y){
        gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
        gl.glVertex2i(x+sftX, -y+sftY);
        gl.glVertex2i(-x+sftX,-y+sftY);
        if(d>=0){
            d=d+b*b*(-2*x+2)+a*a*(2*y+3);
            x--; y++;
        }
        else{
            d=d+a*a*(2*y+3);
             y++;
        }
    }
    gl.glEnd();
    
     a=30;
     b=60;
     x=0;
     y=b;
     sftX=-65;
     sftY=-70;
     d=b*b+a*a*(0.25-b);
    
    gl.glBegin(GL2.GL_POINTS);
    while(a*a*y>b*b*x){
        
        gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
        gl.glVertex2i(x+sftX, -y+sftY);
        gl.glVertex2i(-x+sftX,-y+sftY);
        if(d<0){
            d=d+b*b*(2*x+3);
            x++;
        }
        else{
            d=d+b*b*(2*x+3)+a*a*(-2*y+2);
            x++; y--;
        }
    }
    d=a*a+b*b*(0.25-a);
    x=a; y=0;
    while(b*b*x>a*a*y){
        gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
        gl.glVertex2i(x+sftX, -y+sftY);
        gl.glVertex2i(-x+sftX,-y+sftY);
        if(d>=0){
            d=d+b*b*(-2*x+2)+a*a*(2*y+3);
            x--; y++;
        }
        else{
            d=d+a*a*(2*y+3);
             y++;
        }
    }
    gl.glEnd();
    
    gl.glBegin(GL2.GL_LINES); 
    gl.glVertex2d(-35, 20);  
    gl.glVertex2d(-35,-70);  
    gl.glEnd();
    
    
  //drawing 'a'
     a=30;
     b=25;
     x=0;
     y=b;
     sftX=10;
     sftY=20;
     d=b*b+a*a*(0.25-b);
    
    gl.glBegin(GL2.GL_POINTS);
    while(a*a*y>b*b*x){
        
        //gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
        gl.glVertex2i(x+sftX, -y+sftY);
        gl.glVertex2i(-x+sftX, -y+sftY);
        if(d<0){
            d=d+b*b*(2*x+3);
            x++;
        }
        else{
            d=d+b*b*(2*x+3)+a*a*(-2*y+2);
            x++; y--;
        }
    }
    d=a*a+b*b*(0.25-a);
    x=a; y=0;
    while(b*b*x>a*a*y){
        //gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
       // gl.glVertex2i(x+sftX, -y+sftY);
        gl.glVertex2i(-x+sftX,-y+sftY);
        if(d>=0){
            d=d+b*b*(-2*x+2)+a*a*(2*y+3);
            x--; y++;
        }
        else{
            d=d+a*a*(2*y+3);
             y++;
        }
    }
    gl.glEnd();
    
    gl.glBegin(GL2.GL_LINES); 
    gl.glVertex2d(10, 45);  
    gl.glVertex2d(43,-7);  
    gl.glEnd();
    
  //drawing 'r'
    a=30;
    b=20;
    x=0;
    y=b;
    sftX=85;
    sftY=26;
    d=b*b+a*a*(0.25-b);
    
    gl.glBegin(GL2.GL_POINTS);
    while(a*a*y>b*b*x){
        
        gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
       // gl.glVertex2i(x+sftX, -y+sftY);
       // gl.glVertex2i(-x+sftX, -y+sftY);
        if(d<0){
            d=d+b*b*(2*x+3);
            x++;
        }
        else{
            d=d+b*b*(2*x+3)+a*a*(-2*y+2);
            x++; y--;
        }
    }
    d=a*a+b*b*(0.25-a);
    x=a; y=0;
    while(b*b*x>a*a*y){
        gl.glVertex2i(x+sftX, y+sftY);
        gl.glVertex2i(-x+sftX, y+sftY);
      //  gl.glVertex2i(x+sftX, -y+sftY);
      //  gl.glVertex2i(-x+sftX,-y+sftY);
        if(d>=0){
            d=d+b*b*(-2*x+2)+a*a*(2*y+3);
            x--; y++;
        }
        else{
            d=d+a*a*(2*y+3);
             y++;
        }
    }
    gl.glEnd();
    
    gl.glBegin(GL2.GL_LINES);
    gl.glVertex2d(55, 45);  
    gl.glVertex2d(55,-7);  
    gl.glEnd();
}


public void reshape(GLAutoDrawable drawable, int x, int y, int width,
        int height) {
}

public void displayChanged(GLAutoDrawable drawable,
        boolean modeChanged, boolean deviceChanged) {
}

public void dispose(GLAutoDrawable arg0)
{
 
}
}
public class CSE_423_FirstName {
public static void main(String args[]) {
        //getting the capabilities object of GL2 profile
 final GLProfile profile=GLProfile.get(GLProfile.GL2);
 GLCapabilities capabilities=new GLCapabilities(profile);
 // The canvas
 final GLCanvas glcanvas=new GLCanvas(capabilities);
 ThirdGLEventListener b=new ThirdGLEventListener();
 glcanvas.addGLEventListener(b);
 glcanvas.setSize(400, 400);
 //creating frame
 final JFrame frame=new JFrame("Basic frame");
 //adding canvas to frame
 frame.add(glcanvas);
 frame.setSize(500,400);
 frame.setVisible(true);
}
}