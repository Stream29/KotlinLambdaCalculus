package io.github.stream29

val successor = lambda { n, f, x -> f(n(f)(x)) }

val predecessor = lambda { n -> n(fai)(pair(zero)(zero))(first) }

val add = lambda { a, b -> a(successor)(b) }

val subtract = lambda { a, b -> b(predecessor)(a) }

val multiply = lambda { m, n, f -> m(n(f)) }

val pow = lambda { a, b -> b(a) }

val isZero = lambda { n -> n(`true`(`false`))(`true`) }

val le = lambda { a, b -> isZero(a - b) }

val eq = lambda { a, b -> and(isZero(a - b))(isZero(b - a)) }