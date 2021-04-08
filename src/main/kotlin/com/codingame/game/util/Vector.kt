package com.codingame.game.util

import com.codingame.game.core.Action.*
import com.codingame.game.core.Action.Direction.*

data class Vector(val dx: Int, val dy: Int)

fun direction2vector(direction: Direction): Vector = when(direction) {
    UP    -> Vector(dx =  0, dy = -1)
    DOWN  -> Vector(dx =  0, dy =  1)
    LEFT  -> Vector(dx = -1, dy =  0)
    RIGHT -> Vector(dx =  1, dy =  0)
}
