// 2. Write a program that reads words from a file. Use a mutable map to count
// how often each word appears. To read the words, simply use a java.util.Scanner:
// val in = new java.util.Scanner(java.io.File("myfile.txt
// while (in.hasNext()) process in.next()
// Or look at Chapter 9 for a Scalaesque way.
// At the end, print out all words and their counts.

def printWords(file: String): Unit = {
  var words = scala.collection.mutable.Map[String, Int]()
  val in = new java.util.Scanner(new java.io.File(file))
  
  while (in.hasNext()) {
    val word = in.next
    words(word) = if (words.contains(word)) words(word) else 0 + 1
  }
  
  print(words)
}
