package com.phamtruong.TongHopGiuaKi.Repository;

import com.phamtruong.TongHopGiuaKi.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(String id, Student updatedStudent) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(updatedStudent.getName());
                s.setClassroom(updatedStudent.getClassroom());
                return;
            }
        }
    }

    public void deleteStudent(String id) {
        students.removeIf(s -> s.getId().equals(id));
    }
}
