package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12787 {
    private final Productionnull_12787 production = new Productionnull_12787("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}