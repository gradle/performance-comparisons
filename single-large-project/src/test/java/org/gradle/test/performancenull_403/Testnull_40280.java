package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40280 {
    private final Productionnull_40280 production = new Productionnull_40280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}