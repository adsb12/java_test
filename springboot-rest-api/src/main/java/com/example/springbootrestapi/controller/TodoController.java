package com.example.springbootrestapi.controller;

import org.springframework.http.MediaType;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootrestapi.domain.Todo;
import com.example.springbootrestapi.service.TodoService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TodoController {

  private final TodoService todoService;

  /**
   * To-Do 조회
   */
  @PostMapping(
      value = "/api/todos",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Todo.Response> getTodos(
      HttpServletRequest request,
      HttpServletResponse response,
      @RequestBody Todo.Request todoRequest) {
    return todoService.getTodos(todoRequest);
  }
}