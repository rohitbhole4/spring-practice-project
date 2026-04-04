package com.studentapp.service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService{

    private IStudentRepository repo;

    @Autowired
    public void setRepo(IStudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student addStudent(Student stud) {
        return repo.save(stud);
    }

    @Override
    public Student updateStudent(Student stud) {
        return repo.save(stud);
    }

    @Override
    public void deleteStudent(int studId) {

    }

    @Override
    public Student getById(int studId) {

        Optional<Student> studOpt = repo.findById(studId);
        return studOpt.orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Student> findByDept(String dept) {
        return repo.findByDept(dept);
    }

    @Override
    public List<Student> findByAddressCity(String city) {
        return repo.findByAddressCity(city);
    }
}
