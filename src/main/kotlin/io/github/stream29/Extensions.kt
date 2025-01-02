package io.github.stream29

operator fun Lambda.plus(other: Lambda) = add(this)(other)

operator fun Lambda.minus(other: Lambda) = subtract(this)(other)

operator fun Lambda.times(other: Lambda) = multiply(this)(other)

fun Lambda.toInt(): Int {
    var count = 0
    this { count++; it }(identity)
    return count
}

fun Lambda.toBoolean(): Boolean {
    var result = false
    this(lambda { result = true;it })(lambda { result = false;it })(identity)
    return result
}

fun Int.toChurch(): Lambda =
    if (this <= 0) zero
    else Lambda { f -> Lambda { x -> f((this - 1).toChurch()(f)(x)) } }