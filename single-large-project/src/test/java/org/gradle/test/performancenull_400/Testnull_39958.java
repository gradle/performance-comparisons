package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39958 {
    private final Productionnull_39958 production = new Productionnull_39958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}