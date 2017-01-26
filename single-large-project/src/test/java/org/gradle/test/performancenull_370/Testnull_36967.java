package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36967 {
    private final Productionnull_36967 production = new Productionnull_36967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}