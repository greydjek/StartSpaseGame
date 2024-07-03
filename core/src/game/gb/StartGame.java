package game.gb;

import com.badlogic.gdx.Game;

import game.gb.screen.impl.MenuScreen;

public class StartGame extends Game {

	@Override
	public void create() {
		setScreen(new MenuScreen());
	}
}
