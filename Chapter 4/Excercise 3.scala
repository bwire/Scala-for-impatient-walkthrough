// 3. Repeat the preceding exercise with an immutable map.

def printWords(file: String): Unit = {
  var words = Map[String, Int]()
  val in = new java.util.Scanner(new java.io.File(file))
  
  while (in.hasNext()) {
    val word = in.next()
    val count = words.getOrElse(word, 0)
    words += (word -> (count + 1))
  }
  
  print(words)
}
