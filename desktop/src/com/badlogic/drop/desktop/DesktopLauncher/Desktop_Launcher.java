package com.badlogic.drop.desktop.DesktopLauncher;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.drop.Drop;

class DesktopLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Drop";
        config.width = 1024;
        config.height = 800;
        new LwjglApplication(new Drop(), config);
    }
}