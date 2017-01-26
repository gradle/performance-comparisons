package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33046 {
    private final Productionnull_33046 production = new Productionnull_33046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}