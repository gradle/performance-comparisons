package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23061 {
    private final Productionnull_23061 production = new Productionnull_23061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}