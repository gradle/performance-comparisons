package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43741 {
    private final Productionnull_43741 production = new Productionnull_43741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}