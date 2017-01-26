package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3090 {
    private final Productionnull_3090 production = new Productionnull_3090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}