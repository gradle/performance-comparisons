package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28068 {
    private final Productionnull_28068 production = new Productionnull_28068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}