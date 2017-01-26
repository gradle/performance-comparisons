package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41286 {
    private final Productionnull_41286 production = new Productionnull_41286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}