package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33082 {
    private final Productionnull_33082 production = new Productionnull_33082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}