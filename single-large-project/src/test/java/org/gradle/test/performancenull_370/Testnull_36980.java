package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36980 {
    private final Productionnull_36980 production = new Productionnull_36980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}