object ListSortingAndSearching {
  def main(args: Array[String]): Unit = {
    val list = List(5, 2, 8, 1, 9, 4, 3, 7, 6)

    // Sort the list in ascending order
    val sortedList = list.sorted

    println(s"Original List: $list")
    println(s"Sorted List: $sortedList")

    println("Enter an element to search for:")
    val searchValue = scala.io.StdIn.readInt()

    if (sortedList.contains(searchValue)) {
      println(s"$searchValue found at index ${sortedList.indexOf(searchValue)} in the sorted list.")
    } else {
      println(s"$searchValue not found in the sorted list.")
    }
  }
}
