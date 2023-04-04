import KeybordInput.KeyBordInput;
import Triangulo.MovimentaTriangulo;
import com.jogamp.newt.event.KeyEvent;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

import javax.swing.*;


public class EventListener extends JFrame implements GLEventListener {

   private MovimentaTriangulo mv;
    KeyBordInput key;
    private static GL2 gl;



    @Override
    public void init(GLAutoDrawable drawable) {
         gl = drawable.getGL().getGL2();
        gl.glClearColor(0.0f, 1.0f, 0.0f, 0.0f);
        this.mv = new MovimentaTriangulo(drawable);
        this.key = new KeyBordInput();
        //mv.normal();



    }

    @Override
    public void dispose(GLAutoDrawable drawable) {

    }

    @Override
    public void display(GLAutoDrawable drawable) {

        mv.direita();


        if(key.getKey(KeyEvent.VK_RIGHT)){
            mv.direita();
            System.out.println("direita");
        }
        if(this.key.getKey(KeyEvent.VK_LEFT)){
            mv.esquerda();
            System.out.println("Esquerda");
        }

        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        GL2 gl = drawable.getGL().getGL2();
        gl.glViewport(0, 0, width, height);

    }
}
