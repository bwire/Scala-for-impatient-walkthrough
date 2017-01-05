// 6. How do you rearrange the elements of an Array[Int] so that they appear in
// reverse sorted order? How do you do the same with an ArrayBuffer[Int]?

val a = Array(7, 3, 9, 5, 2, 8)
val ab = ArrayBuffer(7, 3, 9, 5, 2, 8)

a.sortWith(_ > _)
ab.sortWith(_ > _)