package ke.co.ideagalore.todos

import androidx.lifecycle.LiveData


class TodoRepository(private val todoDao: TodoDao) {

val allTodos: LiveData<List<Todo>>=todoDao.getAllTodos()


    suspend fun insert(todo: Todo) {
        todoDao.insert(todo)
    }

}