package com.yzy.pattern.builder.simple;

public class Course {
    private String name;
    private String note;
    private String vido;
    private String ppt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getVido() {
        return vido;
    }

    public void setVido(String vido) {
        this.vido = vido;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", vido='" + vido + '\'' +
                ", ppt='" + ppt + '\'' +
                '}';
    }
}
