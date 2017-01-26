package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6329 {
    private final Productionnull_6329 production = new Productionnull_6329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}