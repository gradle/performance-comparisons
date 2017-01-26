package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30521 {
    private final Productionnull_30521 production = new Productionnull_30521("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}