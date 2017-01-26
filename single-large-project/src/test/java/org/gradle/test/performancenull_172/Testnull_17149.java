package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17149 {
    private final Productionnull_17149 production = new Productionnull_17149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}