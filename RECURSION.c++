#RECURSION
When a function call itself inside its own function it is a RECURSION
a function call itself directly or indirectly 
@DIRECT
void fun ()
{
    fun()
}
 
 @INDIRECT 
  void fun1()
    {
        fun2()
    }
  void fun2()
  {
    fun1()
  }
  