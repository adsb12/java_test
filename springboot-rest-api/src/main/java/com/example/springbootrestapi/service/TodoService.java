package com.example.springbootrestapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootrestapi.domain.Todo;
import com.example.springbootrestapi.mapper.TodoMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TodoService {

  private final TodoMapper todoMapper;

  /** To-Do 조회 */
  public List<Todo.Response> getTodos(Todo.Request todoRequest) {
    return todoMapper.getTodos(todoRequest);
  }
}
