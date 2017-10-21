object MyModule {
  
  def abs(arg: Int): Int = 
  	if (arg < 0) -arg
    else arg
  
  
  private def formatAbs(arg: Int) = {
   	val msg = "The absolute value of %d is %d"
    msg.format(arg, abs(arg))
  }
  
  def main(args : Array[String]) : Unit = {
    println(formatAbs(-42))
  }
}
