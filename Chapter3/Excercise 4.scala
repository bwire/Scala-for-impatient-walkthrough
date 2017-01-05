// 4. Given an array of integers, produce a new array that contains all positive
// values of the original array, in their original order, followed by all values that
// are zero or negative, in their original order.

val a = List(1, 2, -5, 6, -3, -9, 8, -4)
(a filter (_ > 0)) ++ (a filterNot (_ > 0))
