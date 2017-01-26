package org.gradle.test.performancenull_383;

import static org.junit.Assert.*;

public class Testnull_38241 {
    private final Productionnull_38241 production = new Productionnull_38241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}