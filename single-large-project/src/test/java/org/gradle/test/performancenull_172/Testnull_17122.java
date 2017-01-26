package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17122 {
    private final Productionnull_17122 production = new Productionnull_17122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}