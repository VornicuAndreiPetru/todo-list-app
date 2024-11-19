package com.example.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {


    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getAllToDos(){
        return toDoRepository.findAll();
    }

    public ToDo addToDo(ToDo todo){
        return toDoRepository.save(todo);
    }

    public ToDo updateToDo(ToDo todo){
        return toDoRepository.save(todo);
    }
    public void deleteToDo(Long id){
        toDoRepository.deleteById(id);
    }
}
