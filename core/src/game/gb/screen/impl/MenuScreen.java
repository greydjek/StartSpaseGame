package game.gb.screen.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import game.gb.BaseScreen;

public class MenuScreen extends BaseScreen {
private     Texture img;
private Vector2 touch;
private Vector2 v;
private Vector2 adnVector2;
    @Override
    public void show() {
        super.show();
    img = new Texture("badlogic.jpg");
    touch = new Vector2();
    v= new Vector2(1,1);
    adnVector2 = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
batch.begin();
batch.draw(img,touch.x, touch.y);
batch.end();

//touch.add(v);// прибавляем вектор получаем Эффект движения (чем больше вектор тем быстрее)
    }

    @Override
    public void dispose() {
        super.dispose();
    img.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        touch.set(screenX, Gdx.graphics.getHeight() - screenY);
            return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        adnVector2.set(screenX,Gdx.graphics.getHeight() - screenY);
        return super.touchCancelled(screenX, screenY, pointer, button);
    }
}
