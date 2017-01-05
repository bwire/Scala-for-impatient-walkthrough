// 3. Repeat the preceding assignment, but produce a new array with the swapped
// values. Use for/yield.
val a = Array[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
for (i <- 0 until a.length)
  yield if (i % 2 == 1) 
          a(i - 1)
        else
          if (a.length - 1 == i)
            a(i)
          else
            a(i + 1)
