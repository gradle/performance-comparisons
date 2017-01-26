package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28003 {
    private final Productionnull_28003 production = new Productionnull_28003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}