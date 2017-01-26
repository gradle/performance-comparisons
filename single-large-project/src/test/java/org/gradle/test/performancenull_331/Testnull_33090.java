package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33090 {
    private final Productionnull_33090 production = new Productionnull_33090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}