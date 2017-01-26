package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35902 {
    private final Productionnull_35902 production = new Productionnull_35902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}