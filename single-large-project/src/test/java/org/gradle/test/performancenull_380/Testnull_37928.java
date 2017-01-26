package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37928 {
    private final Productionnull_37928 production = new Productionnull_37928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}