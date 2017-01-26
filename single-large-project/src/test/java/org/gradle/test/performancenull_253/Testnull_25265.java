package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25265 {
    private final Productionnull_25265 production = new Productionnull_25265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}