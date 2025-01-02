package io.github.stream29

val and = lambda { a, b -> a(b)(a) }

val or = lambda { a, b -> a(a)(b) }

val not = lambda { a -> a(`false`)(`true`) }

val xor = lambda { a, b -> a(not(b))(b) }