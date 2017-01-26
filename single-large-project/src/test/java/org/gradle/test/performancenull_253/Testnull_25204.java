package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25204 {
    private final Productionnull_25204 production = new Productionnull_25204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}