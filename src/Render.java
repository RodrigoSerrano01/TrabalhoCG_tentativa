import KeybordInput.KeyBordInput;
import com.jogamp.newt.Window;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;


public class Render  {

    private static GLWindow window;
    private static GLCanvas canvas;





    public static void main(String[] args) {

        init();

    }


    public static void init(){

//
//        GLProfile.initSingleton();
//        GLProfile profile = GLProfile.get(GLProfile.GL2);
//        GLCapabilities caps = new GLCapabilities(profile);
//        // MovimentaTriangulo mv= new MovimentaTriangulo(window);
//        window = GLWindow.create(caps);
//        window.setSize(640, 480);
//
//        window.setResizable(false);
//
//        window.addGLEventListener(new EventListener());
//        window.addKeyListener(new KeyBordInput());
//        FPSAnimator animator = new FPSAnimator(window, 24);
//        animator.start();
//        window.setVisible(true);

        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        canvas = new GLCanvas(capabilities);

        // Register event listeners
        EventListener eventListener = new EventListener();
        canvas.addGLEventListener(eventListener);

        // Add canvas to frame
        eventListener.getContentPane().add(canvas);
        canvas.setVisible(true);

    }

}
