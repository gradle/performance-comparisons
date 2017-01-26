package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33771 {
    private final Productionnull_33771 production = new Productionnull_33771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}