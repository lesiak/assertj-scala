import com.lesiak.assertj.scala.ScalaAssertions.assertThat

class ScalaMapAssertSuite extends munit.FunSuite {
    test("containsEntry") {
        val items = Map("a" -> "A", "b" -> "B")
        assertThat(items).containsEntry("a", "A")
    }
}
