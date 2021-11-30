fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    print(readValues(studentsMarks))
}
fun readValues(studentsMarks: MutableMap<String, Int>): MutableMap<String, Int> {
    var nameInput = readLine()!!.toString()
    var markInput = 0
    return when (nameInput){
        "stop" -> {
            return studentsMarks
        }
        else -> {markInput = readLine()!!.toInt()
            return if (!studentsMarks.containsKey(nameInput)) {
                studentsMarks[nameInput] = markInput
                readValues(studentsMarks)
            }   else {
                readValues(studentsMarks)
            }
            }
        }
    }
