package com.example.todolist.listTask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.data.Task
import com.example.todolist.databinding.TaskItemLayoutBinding

class TaskAdapterRecyclerView(private val tasks: List<Task>) : RecyclerView.Adapter<TaskAdapterRecyclerView.TaskHolder>() {

    class TaskHolder(private val binding: TaskItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.task = task
        }

        companion object {
            fun from(parent: ViewGroup): TaskHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = TaskItemLayoutBinding.inflate(inflater, parent, false)
                return TaskHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskHolder {
        return TaskHolder.from(parent)
    }

    override fun onBindViewHolder(holder: TaskHolder, position: Int) {
        holder.bind(tasks[position])
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

}