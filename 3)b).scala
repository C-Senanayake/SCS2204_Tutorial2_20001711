object Main extends App {
  var a:Integer=2
  var b:Integer=3
  var c:Integer=4 
  var d:Integer=5
  var k:Double = 4.3f;
  var g:Double = 4.0f;

  b-=1
  println(b*a+c*d)
  d-=1
  println(a)
  a+=1
  println(-2*(g-k)+c)
  println(c)
  c+=1
  c=(c+1)*a
  a+=1
  println(c)
}