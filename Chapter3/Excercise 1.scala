// Write a code snippet that sets a to an array of n random integers between 0
// (inclusive) and n (exclusive).

val a = new Array[Int](10)
for (i <- 0 until a.length)
  a(i) = scala.util.Random.nextInt
a