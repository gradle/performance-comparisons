package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17146 {
    private final Productionnull_17146 production = new Productionnull_17146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}