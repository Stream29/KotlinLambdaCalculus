package io.github.stream29

inline fun lambda(crossinline block: (Lambda) -> Lambda) =
    Lambda { p0 -> block(p0) }

inline fun lambda(crossinline block: (Lambda, Lambda) -> Lambda) =
    Lambda { p0 -> lambda { p1 -> block(p0, p1) } }

inline fun lambda(crossinline block: (Lambda, Lambda, Lambda) -> Lambda) =
    Lambda { p0 -> lambda { p1, p2 -> block(p0, p1, p2) } }

inline fun lambda(crossinline block: (Lambda, Lambda, Lambda, Lambda) -> Lambda) =
    Lambda { p0 -> lambda { p1, p2, p3 -> block(p0, p1, p2, p3) } }

inline fun lambda(crossinline block: (Lambda, Lambda, Lambda, Lambda, Lambda) -> Lambda) =
    Lambda { p0 -> lambda { p1, p2, p3, p4 -> block(p0, p1, p2, p3, p4) } }

inline fun lambda(crossinline block: (Lambda, Lambda, Lambda, Lambda, Lambda, Lambda) -> Lambda) =
    Lambda { p0 -> lambda { p1, p2, p3, p4, p5 -> block(p0, p1, p2, p3, p4, p5) } }