import com.lesiak.assertj.scala.ScalaAssertions.assertThat

class ScalaMapAssertSuite extends munit.FunSuite {
  test("containsEntry") {
    val items = Map("a" -> "A", "b" -> "B")
    assertThat(items).containsEntry("a", "A")
  }

  test("containsEntry primitives") {
    val items = Map(1 -> 11, 2 -> 12)
    assertThat(items).containsEntry(1, 11)
  }
}
