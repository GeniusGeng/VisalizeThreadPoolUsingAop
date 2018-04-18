# VisalizeThreadPoolUsingAop
Printing threadPool information(taskCount,completedTaskCount,activiCount,queueSize) when invoking method with a custom annotition.
每次调用被自定义标签标记的方法的时候，都会触发AOP的切面，而打印出当前线程的信息,线程的任务总数，已完成数，当前正在运行和队列中等待的线程数。

Running the code and console outputs:
运行代码，控制台输出：
2018-04-18 22:04:19.592  INFO 12748 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 
2018-04-18 22:04:19.597  INFO 12748 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService  'asyncServiceExecutor'
2018-04-18 22:04:19.681  INFO 12748 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.699  INFO 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
2018-04-18 22:04:19.867 DEBUG 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 169 ms
2018-04-18 22:04:19.867  INFO 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [1], activeCount [8], queueSize [21]
2018-04-18 22:04:20.486 DEBUG 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 788 ms
2018-04-18 22:04:20.486  INFO 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [2], activeCount [8], queueSize [20]
2018-04-18 22:04:20.565 DEBUG 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 698 ms
2018-04-18 22:04:20.565  INFO 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [3], activeCount [8], queueSize [19]
2018-04-18 22:04:21.428 DEBUG 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 863 ms
2018-04-18 22:04:21.428  INFO 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [4], activeCount [8], queueSize [18]
2018-04-18 22:04:22.100 DEBUG 12748 --- [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2402 ms
2018-04-18 22:04:22.100  INFO 12748 --- [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [5], activeCount [8], queueSize [17]
2018-04-18 22:04:22.943 DEBUG 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2457 ms
2018-04-18 22:04:22.943  INFO 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [6], activeCount [8], queueSize [16]
2018-04-18 22:04:22.948 DEBUG 12748 --- [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3250 ms
2018-04-18 22:04:22.948  INFO 12748 --- [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [7], activeCount [8], queueSize [15]
2018-04-18 22:04:22.975 DEBUG 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3277 ms
2018-04-18 22:04:22.975  INFO 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [8], activeCount [8], queueSize [14]
2018-04-18 22:04:23.123 DEBUG 12748 --- [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3425 ms
2018-04-18 22:04:23.123  INFO 12748 --- [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [9], activeCount [8], queueSize [13]
2018-04-18 22:04:23.315 DEBUG 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3617 ms
2018-04-18 22:04:23.315  INFO 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [10], activeCount [8], queueSize [12]
2018-04-18 22:04:23.334 DEBUG 12748 --- [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3636 ms
2018-04-18 22:04:23.335  INFO 12748 --- [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [11], activeCount [8], queueSize [11]
2018-04-18 22:04:23.627 DEBUG 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 312 ms
2018-04-18 22:04:23.627  INFO 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [12], activeCount [8], queueSize [10]
2018-04-18 22:04:23.771 DEBUG 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2343 ms
2018-04-18 22:04:23.771  INFO 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [13], activeCount [8], queueSize [9]
2018-04-18 22:04:24.794 DEBUG 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1819 ms
2018-04-18 22:04:24.794  INFO 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [14], activeCount [8], queueSize [8]
2018-04-18 22:04:25.232 DEBUG 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1605 ms
2018-04-18 22:04:25.232  INFO 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [15], activeCount [8], queueSize [7]
2018-04-18 22:04:25.327 DEBUG 12748 --- [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2379 ms
2018-04-18 22:04:25.327  INFO 12748 --- [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [16], activeCount [8], queueSize [6]
2018-04-18 22:04:25.786 DEBUG 12748 --- [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3686 ms
2018-04-18 22:04:25.786  INFO 12748 --- [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [17], activeCount [8], queueSize [5]
2018-04-18 22:04:26.146 DEBUG 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3203 ms
2018-04-18 22:04:26.146  INFO 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [18], activeCount [8], queueSize [4]
2018-04-18 22:04:26.275 DEBUG 12748 --- [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3152 ms
2018-04-18 22:04:26.275  INFO 12748 --- [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [19], activeCount [8], queueSize [3]
2018-04-18 22:04:27.067 DEBUG 12748 --- [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3732 ms
2018-04-18 22:04:27.067  INFO 12748 --- [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [20], activeCount [8], queueSize [2]
2018-04-18 22:04:27.255 DEBUG 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1109 ms
2018-04-18 22:04:27.255  INFO 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [21], activeCount [8], queueSize [1]
2018-04-18 22:04:27.361 DEBUG 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2567 ms
2018-04-18 22:04:27.361  INFO 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [22], activeCount [8], queueSize [0]
2018-04-18 22:04:27.413 DEBUG 12748 --- [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3642 ms
2018-04-18 22:04:27.711 DEBUG 12748 --- [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1436 ms
2018-04-18 22:04:28.173 DEBUG 12748 --- [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 918 ms
2018-04-18 22:04:28.683 DEBUG 12748 --- [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1322 ms
2018-04-18 22:04:28.863 DEBUG 12748 --- [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3631 ms
2018-04-18 22:04:29.397 DEBUG 12748 --- [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 4070 ms
2018-04-18 22:04:29.536 DEBUG 12748 --- [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3750 ms
2018-04-18 22:04:30.086 DEBUG 12748 --- [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3019 ms
2018-04-18 22:04:30.086  INFO 12748 --- [           main] c.e.aopDemo.VisualizeThreadPoolUsingAop  : Started VisualizeThreadPoolUsingAop in 11.234 seconds (JVM running for 11.962)
