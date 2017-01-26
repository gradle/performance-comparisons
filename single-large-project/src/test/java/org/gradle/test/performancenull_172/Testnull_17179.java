package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17179 {
    private final Productionnull_17179 production = new Productionnull_17179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}