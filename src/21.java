import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    @PostMapping("/student")
    fun addStudent(@RequestBody student: String): String {
        return "Student added successfully"
    }
}
