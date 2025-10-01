import com.lesiak.assertj.scala.ScalaAssertions.assertThat

class ScalaOptionAssertSuite extends munit.FunSuite {
    test("None is Empty") {
        val option = None
        assertThat(option).isEmpty
    }
}
