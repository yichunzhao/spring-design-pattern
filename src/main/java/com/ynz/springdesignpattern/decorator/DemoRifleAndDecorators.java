package com.ynz.springdesignpattern.decorator;

public class DemoRifleAndDecorators {

    public static void main(String[] args) {
        Rifle rifle = new Rifle();

        LaserGenerator laserDecoratedRifle = new LaserGenerator(rifle);
        laserDecoratedRifle.launch();
        laserDecoratedRifle.shoot();

        System.out.println("++++++++++++++++++++++");

        GrenadeLauncher grenadeLauncherDecoratedRifle = new GrenadeLauncher(laserDecoratedRifle);
        grenadeLauncherDecoratedRifle.shoot();
        grenadeLauncherDecoratedRifle.launch();

    }
}
