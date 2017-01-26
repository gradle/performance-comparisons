package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43766 {
    private final Productionnull_43766 production = new Productionnull_43766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}