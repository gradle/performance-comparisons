package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14080 {
    private final Productionnull_14080 production = new Productionnull_14080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}