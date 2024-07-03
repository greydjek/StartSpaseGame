package game.gb;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class BaseScreen implements Screen, InputProcessor {
protected     SpriteBatch batch;
    @Override
    public void show() {
        batch = new SpriteBatch();
        Gdx.input.setInputProcessor(this);

        System.out.printf("show");
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.BLUE);

    }

    @Override
    public void resize(int width, int height) {

        System.out.println("resize width = " + width + "resize height = " + height );
    }

    @Override
    public void pause() {
        System.out.printf("pause");

    }

    @Override
    public void resume() {
        System.out.printf("resume");
    }

    @Override
    public void hide() {
        System.out.printf("hide");
    }

    @Override
    public void dispose() {
        System.out.printf("dispose");
batch.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {
        System.out.printf("keyDown  " + keycode );
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        System.out.printf("keyUp  " + keycode );
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.printf("keyTyped  " + character );
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchDown screenX = " + screenX + " screenY = " + screenY );
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchUp screenX = " + screenX + " screenY = " + screenY );
        return false;
    }

    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        System.out.println("touchDragged screenX = " + screenX + " screenY = " + screenY );
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        System.out.println("scrolled amountX = " + amountX + " amountY = " + amountY );

        return false;
    }
}
