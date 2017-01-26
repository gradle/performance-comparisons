package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23497 {
    private final Productionnull_23497 production = new Productionnull_23497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}