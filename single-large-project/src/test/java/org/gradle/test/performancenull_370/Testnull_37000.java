package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_37000 {
    private final Productionnull_37000 production = new Productionnull_37000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}