package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28060 {
    private final Productionnull_28060 production = new Productionnull_28060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}