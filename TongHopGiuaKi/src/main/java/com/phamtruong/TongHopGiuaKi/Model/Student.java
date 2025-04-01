package com.phamtruong.TongHopGiuaKi.Model;

public class Student {
    private String id;
    private String name;
    private String classroom;

    public Student() {}

    public Student(String id, String name, String classroom) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getClassroom() { return classroom; }
    public void setClassroom(String classroom) { this.classroom = classroom; }
}
