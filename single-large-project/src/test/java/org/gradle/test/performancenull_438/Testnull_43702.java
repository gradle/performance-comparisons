package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43702 {
    private final Productionnull_43702 production = new Productionnull_43702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}