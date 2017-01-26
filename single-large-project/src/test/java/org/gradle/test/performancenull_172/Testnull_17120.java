package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17120 {
    private final Productionnull_17120 production = new Productionnull_17120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}