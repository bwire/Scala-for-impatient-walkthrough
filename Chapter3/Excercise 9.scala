// 9. Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
// that are in America. Strip off the "America/" prefix and sort the result.

val getAmericaIdsSorted: Array[String] = {
	val searchString = "America/"
	val len = searchString.length
 	getAvailableIDs filter (_.startsWith(searchString)) map (_.drop(len)) sorted
}