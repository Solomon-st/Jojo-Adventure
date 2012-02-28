package com.sol.jojo;

import android.graphics.Bitmap;

public class Map {
	Bitmap appear;
	int width;
	int length;
	Material type;

	public Map(Bitmap appear, int width, int length, Material type) {

	}

	enum Material {
		block, coin, item, hit, background
	}

	boolean effect() {
		switch (type) {
		case block: {//
			break;
		}
		case background: {
			break;
		}
		default: {
		}
		}
		return false;
	}
}
