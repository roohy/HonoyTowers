package com.example.firstgame;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.util.Log;

public class Disk extends Sprite {
	
	public Disk(float pX , float pY , ITextureRegion pTextureRegion , VertexBufferObjectManager pVertexBufferObjectManager){
		super(pX, pY , pTextureRegion, pVertexBufferObjectManager);
		
	}
	
	@Override
	 public boolean onAreaTouched(TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY){
		this.setPosition(pSceneTouchEvent.getX() - this.getWidth()/2 , pSceneTouchEvent.getY() - this.getHeight()/2);
		Log.i("roohy" , "im touched");
		return true;
	}

}
