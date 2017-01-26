package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36958 {
    private final Productionnull_36958 production = new Productionnull_36958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}