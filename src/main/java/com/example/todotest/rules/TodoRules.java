package com.example.todotest.rules;

import com.example.todotest.model.Todo;

public class TodoRules {
    /**
     * Update the oldTodo reference with values form the newTodo.
     * Applies the following rules:
     *   - If the description attribute is empty do not the update
     *   on the old value.
     *
     * @param oldTodo Object retrieved from database and should be updated.
     * @param newTodo Object that was received from client with new values.
     * @return
     */
    public static void updateTodo(Todo oldTodo, Todo newTodo) {
        oldTodo.setTitle(newTodo.getTitle());
        if (newTodo.getDescription() != null && !newTodo.getDescription().isEmpty())
            oldTodo.setDescription(newTodo.getDescription());
        oldTodo.setDone(newTodo.getDone());
    }

}
