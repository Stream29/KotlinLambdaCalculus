package io.github.stream29

fun interface Lambda {
    operator fun invoke(f: Lambda): Lambda
}