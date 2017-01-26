package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43709 {
    private final Productionnull_43709 production = new Productionnull_43709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}