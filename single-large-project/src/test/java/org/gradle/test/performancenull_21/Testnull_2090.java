package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2090 {
    private final Productionnull_2090 production = new Productionnull_2090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}