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
    private Vector2 start;


    @Override
    public void show() {
        super.show();
    img = new Texture("badlogic.jpg");
    touch = new Vector2();
    start = new Vector2(0,0);
    v= new Vector2(1,1);
    adnVector2 = new Vector2();
    }

Vector2 retVector(Vector2 v, Vector2 v2){
  //   while((v.x != v2.x)&& (v.y != v2.y) ) {
   if ((v.x != v2.x) | (v.y != v2.y)){
       if (v.x < v2.x) {
           v.add(1, 0);
       }
       //     if (v.x != v2.x)
       if (v.x > v2.x) {
           v.add(-1, 0);
       }
     //         if (v.y != v2.y)
       if (v.y < v2.y) {
           v.add(0, 1);
       }
   //                if (v.y != v2.y)
       if (v.y > v2.y) {
           v.add(0, -1);
       }

   }
    return v;
    }
    @Override
    public void render(float delta) {
        super.render(delta);
batch.begin();
batch.draw(img,start.x,start.y);
batch.end();
if(!start.equals(adnVector2)){
 start.set(retVector(start,adnVector2));
}

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
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        adnVector2.set(screenX,Gdx.graphics.getHeight() - screenY);
        return super.touchUp(screenX, screenY, pointer, button);
    }
}
