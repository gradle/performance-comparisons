package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15303 {
    private final Productionnull_15303 production = new Productionnull_15303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}