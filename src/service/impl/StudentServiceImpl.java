package service.impl;

import db.Database;
import model.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private List <Database> database;
    @Override
    public String addStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
