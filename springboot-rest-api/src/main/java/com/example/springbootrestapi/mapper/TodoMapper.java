package com.example.springbootrestapi.mapper;

import java.util.List;

import com.example.springbootrestapi.domain.Todo;

public interface TodoMapper {

	  /** To-Do 조회 */
	  List<Todo.Response> getTodos(Todo.Request todoRequest);
	}
