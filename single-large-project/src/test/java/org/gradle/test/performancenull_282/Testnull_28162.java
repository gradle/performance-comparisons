package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28162 {
    private final Productionnull_28162 production = new Productionnull_28162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}