package me.sweetll.tucao.model.raw

import me.sweetll.tucao.model.json.Channel
import me.sweetll.tucao.model.json.Result

data class Game(val recommends: List<Pair<Channel,List<Result>>>)
