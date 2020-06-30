package com.ynz.springdesignpattern.decorator;

/**
 * Add a new functionality to an existing instance in a runtime.
 */
public class DemoRifleAndDecorators {

    public static void main(String[] args) {
        Rifle rifle = new Rifle();
        rifle.shoot();

        System.out.println("++++++++++++++++++++++");

        LaserGenerator laserDecoratedRifle = new LaserGenerator(rifle);
        laserDecoratedRifle.launch();
        laserDecoratedRifle.shoot();

        System.out.println("++++++++++++++++++++++");

        GrenadeLauncher grenadeLauncherDecoratedRifle = new GrenadeLauncher(laserDecoratedRifle);
        grenadeLauncherDecoratedRifle.shoot();
        grenadeLauncherDecoratedRifle.launch();

    }
}
