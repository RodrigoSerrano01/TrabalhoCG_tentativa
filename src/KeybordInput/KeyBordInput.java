package KeybordInput;


import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;

public class KeyBordInput implements KeyListener {

    private static boolean [] keys = new boolean[256];

    public boolean getKey(int keyCode){
        return keys[keyCode];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]= true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()]= false;
    }
}
