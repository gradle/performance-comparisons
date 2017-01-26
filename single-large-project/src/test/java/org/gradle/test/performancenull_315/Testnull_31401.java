package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31401 {
    private final Productionnull_31401 production = new Productionnull_31401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}