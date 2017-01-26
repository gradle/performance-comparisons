package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21789 {
    private final Productionnull_21789 production = new Productionnull_21789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}