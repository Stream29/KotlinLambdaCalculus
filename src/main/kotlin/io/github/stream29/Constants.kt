package io.github.stream29

val identity = lambda { it -> it }

val zero = lambda { f, x -> x }

val one = lambda { f, x -> f(x) }

val `true` = lambda { a, b -> a }

val `false` = lambda { a, b -> b }