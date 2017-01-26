package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5283 {
    private final Productionnull_5283 production = new Productionnull_5283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}