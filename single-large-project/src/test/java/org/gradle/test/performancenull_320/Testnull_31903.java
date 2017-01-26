package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31903 {
    private final Productionnull_31903 production = new Productionnull_31903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}