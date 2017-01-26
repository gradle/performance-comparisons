package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17139 {
    private final Productionnull_17139 production = new Productionnull_17139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}