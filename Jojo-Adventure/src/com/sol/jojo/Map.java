package com.sol.jojo;

import android.graphics.Bitmap;

public class Map {
    Bitmap    appear;
    final int width;
    final int length;
    Material  type;
    
    public Map(Bitmap appear, Material type) {
        this.appear = appear;
        width = 0;//need get value from R, define value with 'dp' in resource
        length = 0;
        this.type = type;
    }
    
    enum Material {
        block, coin, item, hit, bg
    }
    
    boolean effect() {
        switch (type) {
            case block: {//
                break;
            }
            case bg: {
                break;
            }
            default: {
            }
        }
        return false;
    }
}
