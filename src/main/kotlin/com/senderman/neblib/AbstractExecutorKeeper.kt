package com.senderman.neblib

abstract class AbstractExecutorKeeper {

    protected val commandExecutors: MutableMap<String, CommandExecutor> = HashMap()

    protected fun register(executor: CommandExecutor) {
        commandExecutors[executor.command] = executor
    }

    fun findExecutor(command: String): CommandExecutor? = commandExecutors[command]
}
