import io.github.stream29.*
import kotlin.test.Test
import kotlin.test.assertEquals

class LambdaCalculusTest {
    @Test
    fun `church numerals`() {
        val zero = lambda { f, x -> x }
        val one = lambda { f, x -> f(x) }
        val two = lambda { f, x -> f(f(x)) }
        val three = lambda { f, x -> f(f(f(x))) }
        val four = lambda { f, x -> f(f(f(f(x)))) }
        val five = lambda { f, x -> f(f(f(f(f(x))))) }

        assertEquals(0, zero.toInt())
        assertEquals(1, one.toInt())
        assertEquals(2, two.toInt())
        assertEquals(3, three.toInt())
        assertEquals(4, four.toInt())
        assertEquals(5, five.toInt())
    }

    @Test
    fun `arithmetic calculations`() {
        assertEquals(5, (3.toChurch() + 2.toChurch()).toInt())
        assertEquals(1, (3.toChurch() - 2.toChurch()).toInt())
        assertEquals(6, (3.toChurch() * 2.toChurch()).toInt())
        assertEquals(1024, pow(2.toChurch())(10.toChurch()).toInt())
    }

    @Test
    fun `comparison operations`() {
        assertEquals(true, le(2.toChurch())(3.toChurch()).toBoolean())
        assertEquals(false, le(3.toChurch())(2.toChurch()).toBoolean())

        assertEquals(true, eq(2.toChurch())(2.toChurch()).toBoolean())
        assertEquals(false, eq(2.toChurch())(3.toChurch()).toBoolean())
    }

    @Test
    fun `boolean operations`() {
        assertEquals(true, `true`.toBoolean())
        assertEquals(false, `false`.toBoolean())

        assertEquals(true, and(`true`)(`true`).toBoolean())
        assertEquals(false, and(`true`)(`false`).toBoolean())
        assertEquals(false, and(`false`)(`true`).toBoolean())
        assertEquals(false, and(`false`)(`false`).toBoolean())

        assertEquals(true, or(`true`)(`true`).toBoolean())
        assertEquals(true, or(`true`)(`false`).toBoolean())
        assertEquals(true, or(`false`)(`true`).toBoolean())
        assertEquals(false, or(`false`)(`false`).toBoolean())

        assertEquals(false, xor(`true`)(`true`).toBoolean())
        assertEquals(true, xor(`true`)(`false`).toBoolean())
        assertEquals(true, xor(`false`)(`true`).toBoolean())
        assertEquals(false, xor(`false`)(`false`).toBoolean())

        assertEquals(true, not(`false`).toBoolean())
        assertEquals(false, not(`true`).toBoolean())
    }
}