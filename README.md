# VisalizeThreadPoolUsingAop
Printing threadPool information(taskCount,completedTaskCount,activiCount,queueSize) when invoking method with a custom annotition.

每次调用被自定义标签标记的方法的时候，都会触发AOP的切面，而打印出当前线程的信息,线程的任务总数，已完成数，当前正在运行和队列中等待的线程数。

Running the code and console outputs:

运行代码，控制台输出：

 [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 
 [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService  'asyncServiceExecutor'
 [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
 
 [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [0], activeCount [8], queueSize [22]
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 169 ms
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [1], activeCount [8], queueSize [21]
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 788 ms
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [2], activeCount [8], queueSize [20]
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 698 ms
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [3], activeCount [8], queueSize [19]
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 863 ms
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [4], activeCount [8], queueSize [18]
 
 [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2402 ms
 
 [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [5], activeCount [8], queueSize [17]
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2457 ms
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [6], activeCount [8], queueSize [16]
 
 [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3250 ms
 
 [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [7], activeCount [8], queueSize [15]
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3277 ms
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [8], activeCount [8], queueSize [14]
 
 [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3425 ms
 
 [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [9], activeCount [8], queueSize [13]
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3617 ms
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [10], activeCount [8], queueSize [12]
 
 [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3636 ms
 
 [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [11], activeCount [8], queueSize [11]
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 312 ms
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [12], activeCount [8], queueSize [10]
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2343 ms
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [13], activeCount [8], queueSize [9]
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1819 ms
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [14], activeCount [8], queueSize [8]
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1605 ms
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [15], activeCount [8], queueSize [7]
 
 [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2379 ms
 
 [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [16], activeCount [8], queueSize [6]
 
 [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3686 ms
 
 [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [17], activeCount [8], queueSize [5]
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3203 ms
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [18], activeCount [8], queueSize [4]
 
 [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3152 ms
 
 [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [19], activeCount [8], queueSize [3]
 
 [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3732 ms
 
 [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [20], activeCount [8], queueSize [2]
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1109 ms
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [21], activeCount [8], queueSize [1]
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 2567 ms
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : taskCount [30], completedTaskCount [22], activeCount [8], queueSize [0]
 
 [readPool-asyc-8] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3642 ms
 
 [readPool-asyc-2] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1436 ms
 
 [readPool-asyc-1] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 918 ms
 
 [readPool-asyc-3] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 1322 ms
 
 [readPool-asyc-7] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3631 ms
 
 [readPool-asyc-5] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 4070 ms
 
 [readPool-asyc-6] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3750 ms
 
 [readPool-asyc-4] c.e.a.service.ViewThreadPoolExecutor     : Method com.example.aopDemo.task.AsyncTask.execAddData () execution time : 3019 ms
 
 [           main] c.e.aopDemo.VisualizeThreadPoolUsingAop  : Started VisualizeThreadPoolUsingAop in 11.234 seconds (JVM running for 11.962)
