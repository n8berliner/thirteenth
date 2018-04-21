import java.time.DayOfWeek
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder

fun main(args: Array<String>) {
    println("Friday The 13th Finder")

    var numberDate = LocalDateTime.now().withDayOfMonth(13)

    do {
        if (numberDate.dayOfWeek == DayOfWeek.FRIDAY) {
            println("${numberDate.format(DateTimeFormatter.ofPattern("MMM d, uuuu"))}")
        }
        numberDate = numberDate.plusMonths(1)
    } while (numberDate.year < 2050)
}