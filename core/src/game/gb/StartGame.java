package game.gb;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class StartGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int x=0,y=0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		x+=5;y+=2;
		ScreenUtils.clear(Color.BLUE);
		batch.begin();
		batch.draw(img, 200, 100);
		batch.setColor(0.2f,0.2f,0.2f,1f);
		batch.draw(img, 100, 200, 200,200);
		batch.setColor(1f,1f,1f,1f);
		batch.draw(img,x,y,20,20);

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
