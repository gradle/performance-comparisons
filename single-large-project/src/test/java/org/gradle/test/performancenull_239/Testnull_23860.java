package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23860 {
    private final Productionnull_23860 production = new Productionnull_23860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}