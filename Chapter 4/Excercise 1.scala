// 1. Set up a map of prices for a number of gizmos that you covet. Then produce
// a second map with the same keys and the prices at a 10 percent discount.
 
val goods = Map("Car" -> 25000, "Environment" -> 20000, "Tour" -> 5000)
 
for ((k, v) <- goods) yield k -> v * 0.01

-- or

goods map { p => (p._1, p._2 * 0.9) }
