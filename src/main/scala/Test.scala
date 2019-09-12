object ThreadRunner {

  def main(args: Array[String]): Unit = {

    val stuffThread = new Thread() {
      setDaemon(false)
      override def run(): Unit = {
        println("Starting stuff thread")
        while (true) {
          Thread.sleep(200)
          print(".")
        }
      }
    }
    stuffThread.start()
    println("Main ended")
  }
}