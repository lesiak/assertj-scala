import com.lesiak.assertj.scala.ScalaAssertions.assertThat

class ScalaOptionAssertSuite extends munit.FunSuite {
  test("None is Empty") {
    val option = None
    assertThat(option).isEmpty
  }

  test("contains") {
    val option = Some("A")
    assertThat(option).contains("A")
  }

  test("contains primitive") {
    val option = Some(1)
    assertThat(option).contains(1)
  }
}
