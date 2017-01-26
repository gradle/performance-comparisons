package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30932 {
    private final Productionnull_30932 production = new Productionnull_30932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}