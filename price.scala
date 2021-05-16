object price extends App {
  def cost(x:Int):Double = (x*24.95*0.6)+3+(if(x>50) (x-50)*0.75 else 0)
  println(cost(60))
  }