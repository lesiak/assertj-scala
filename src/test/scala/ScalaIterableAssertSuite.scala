import com.lesiak.assertj.scala.ScalaAssertions.assertThat

class ScalaIterableAssertSuite extends munit.FunSuite {
  test("contains") {
    val items = List("A", "B", "C")
    assertThat(items).contains("A")
  }
}
