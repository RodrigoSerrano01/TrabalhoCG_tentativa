package Triangulo;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public  class MovimentaTriangulo {

    GLAutoDrawable drawable;
    GL2 gl ;


    public  MovimentaTriangulo(GLAutoDrawable drawable) {
        this.drawable = drawable;
        this.gl = drawable.getGL().getGL2();
        this.gl.glBegin(GL.GL_TRIANGLES);
    }

    public void normal(){
                //Normal
        this.gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex2f(-0.5f, -0.5f);
        gl.glVertex2f(0.5f, -0.5f);
        gl.glVertex2f(0.0f, 0.5f);
        gl.glLoadIdentity();
        gl.glEnd();
    }

    public void virado(){
        //baixo
        this.gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex2f(-0.5f, 0.5f);
        gl.glVertex2f(0.0f, -0.5f);
        gl.glVertex2f(0.5f, 0.5f);
        gl.glLoadIdentity();
        gl.glEnd();


    }

    public void direita(){

        this.gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );

        //Lado direito
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex2f(-0.5f, 0.5f);
        gl.glVertex2f(0.5f, 0.0f);
        gl.glVertex2f(-0.5f, -0.5f);
        gl.glLoadIdentity();
        gl.glEnd();
        System.out.println("passou");


    }

    public void esquerda(){
        this.gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );

                //Lado esquerdo
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex2f(0.5f, -0.5f);
        gl.glVertex2f(-0.5f, -0.0f);
        gl.glVertex2f(0.5f, 0.5f);
        gl.glLoadIdentity();
        gl.glEnd();

    }














}
