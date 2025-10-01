import com.lesiak.assertj.scala.ScalaAssertions.assertThat

class ScalaIterableAssertSuite extends munit.FunSuite {
  test("contains") {
    val items = List("A", "B", "C")
    assertThat(items).contains("A")
  }

  test("primitive contains") {
    val items = List(1, 2, 3)
    assertThat(items).contains(1)
  }
}
