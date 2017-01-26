package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24927 {
    private final Productionnull_24927 production = new Productionnull_24927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}