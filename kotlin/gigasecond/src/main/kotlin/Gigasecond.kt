import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(inputDate: LocalDateTime) {
    var date: LocalDateTime = inputDate.plusSeconds(1000000000)
    constructor(inputDate: LocalDate) : this(inputDate.atStartOfDay())
}


