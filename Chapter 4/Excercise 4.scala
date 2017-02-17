// 4. Repeat the preceding exercise with a sorted map, so that the words are
// printed in sorted order.

def printWords(file: String): Unit = {
  var words = scala.collection.immutable.SortedMap[String, Int]()
  val in = new java.util.Scanner(new java.io.File(file))
  
  while (in.hasNext()) {
    val word = in.next()
    val count = words.getOrElse(word, 0)
    words += (word -> (count + 1))
  }
  
  print(words)
}
