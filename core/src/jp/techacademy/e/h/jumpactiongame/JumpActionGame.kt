package jp.techacademy.e.h.jumpactiongame

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class JumpActionGame(val mRequestHandler: ActivityRequestHandler) : Game()  {
    lateinit var batch: SpriteBatch

    override fun create() {
        batch = SpriteBatch()

        //GameScrennを表示する
        setScreen(GameScreen(this))
    }
}
