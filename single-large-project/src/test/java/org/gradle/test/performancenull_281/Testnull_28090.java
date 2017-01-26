package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28090 {
    private final Productionnull_28090 production = new Productionnull_28090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}