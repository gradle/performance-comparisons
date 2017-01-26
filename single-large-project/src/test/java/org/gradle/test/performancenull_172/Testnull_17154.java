package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17154 {
    private final Productionnull_17154 production = new Productionnull_17154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}