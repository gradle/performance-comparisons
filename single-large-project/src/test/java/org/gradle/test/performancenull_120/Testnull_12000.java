package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_12000 {
    private final Productionnull_12000 production = new Productionnull_12000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}