package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36986 {
    private final Productionnull_36986 production = new Productionnull_36986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}