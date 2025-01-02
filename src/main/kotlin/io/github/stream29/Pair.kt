package io.github.stream29

val pair = lambda { a, b, f -> f(a)(b) }

val first = `true`

val second = `false`

val fai = lambda { p -> pair(p(second))(successor(p(second))) }