package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18282 {
    private final Productionnull_18282 production = new Productionnull_18282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}