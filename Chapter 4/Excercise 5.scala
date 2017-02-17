// 5. Repeat the preceding exercise with a java.util.TreeMap that you adapt to the
// Scala API.

import java.util.TreeMap
import scala.collection.JavaConversions.mapAsScalaMap

def printWords(file: String): Unit = {
  var words: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
  val in = new java.util.Scanner(new java.io.File(file))
  
  while (in.hasNext()) {
    val word = in.next()
    val count = words.getOrElse(word, 0)
    words += (word -> (count + 1))
  }
  
  print(words)
}