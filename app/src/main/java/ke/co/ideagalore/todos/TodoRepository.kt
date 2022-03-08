package ke.co.ideagalore.todos

import androidx.lifecycle.LiveData


class TodoRepository(private val todoDao: TodoDao) {




    suspend fun insert(todo: Todo) {
        todoDao.insert(todo)
    }

}