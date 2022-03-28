package com.emergentes.dos;
/**
 * @author Fernando
 */
public class ListaTareas {

    private int id;
    private String tarea;
    private boolean compleatado;

    public ListaTareas() {
    }

    public ListaTareas(int id, String tarea, boolean compleatado) {
        this.id = id;
        this.tarea = tarea;
        this.compleatado = compleatado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public boolean isCompleatado() {
        return compleatado;
    }

    public void setCompleatado(boolean compleatado) {
        this.compleatado = compleatado;
    }

}