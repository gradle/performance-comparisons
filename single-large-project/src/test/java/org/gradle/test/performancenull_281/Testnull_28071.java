package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28071 {
    private final Productionnull_28071 production = new Productionnull_28071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}