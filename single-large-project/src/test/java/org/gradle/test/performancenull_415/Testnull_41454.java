package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41454 {
    private final Productionnull_41454 production = new Productionnull_41454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}