package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17431 {
    private final Productionnull_17431 production = new Productionnull_17431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}