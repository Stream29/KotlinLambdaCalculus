package io.github.stream29

val y = lambda { y -> lambda { x -> y(x(x)) }(lambda { x -> y(x(x)) }) }