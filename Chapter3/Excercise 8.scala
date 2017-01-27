// 8. Rewrite the example at the end of Section 3.4, "Transforming Arrays," on
// page 34 using the drop method for dropping the index of the first match. Look
// the method up in Scaladoc.

import scala.collection.mutable._

val a = ArrayBuffer(1, -2, 3, 4, -5, -2, 9)

def dropAllNegsExceptFirst(a: ArrayBuffer[Int]): Unit {
  val idxs = (for (i <- 0 until a.length if a(i) < 0) yield i).reverse.init
  for (i <- idxs) a.remove(i)
}