// Write a loop that swaps adjacent elements of an array of integers. For example,
// Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
val a = Array[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
for (i <- 0 until (if (a.length % 2 == 0) a.length else a.length - 1) if (i % 2 == 1)) {
  val temp = a(i)
  a(i) = a(i - 1)
  a(i - 1) = temp
} 
a