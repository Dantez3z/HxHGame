package ru.titarev.game.creature

import ru.titarev.game.ability.Damage
import java.security.Guard

abstract class Creature {
    abstract var health: Int
    abstract var guard: Int
    abstract var attack: Int
    abstract val damage: Damage

    fun hit(guard: Int) {
        var modOfAttack: Int = attack - guard + 1
        if (rollDice(modOfAttack)) {
            //рандомный урон
        } else {
            //
        }
    }

    fun rollDice(modOfAttack: Int): Boolean {
        return true
    }
}