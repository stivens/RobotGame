package com.codingame.game

import com.codingame.game.core.Action.*
import com.codingame.game.core.Position

object Config {
    object Robots {
        const val MAX_HEALTH: Int = 10
        const val ATTACK_DAMAGE: Int = 2
        const val COLLISION_DAMAGE: Int = 1
        const val EXPLOSION_DAMAGE: Int = 4
        const val EXPLOSION_RANGE: Int = 1
        const val GUARD_MODIFIER: Double = 0.5
        const val VISION_RANGE: Int = 1
    }

    object Arena {
        const val WIDTH: Int = 10
        const val HEIGHT: Int = 8
    }

    object Referee {
        const val MAX_TURNS: Int = 20
        const val FIRST_TURN_MAX_TIME = 1000
        const val TURN_MAX_TIME = 50
        const val FRAME_DURATION = 500

        val SPAWN_SYMMETRY_CENTER = Position(0, 0)
        const val SPAWN_TURN_DELAY: Int = 10
        const val SPAWN_ATTEMPTS_LIMIT: Int = 15
        const val SPAWN_COMPLEMENT_RANGE = 1
    }

    object Interpreter {
        val ACTION_PRIORITY = mapOf(
                      Guard::class to 0,
                       Move::class to 1,
                     Attack::class to 2,
            Selfdestruction::class to 3,
        )
    }
}
