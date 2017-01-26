package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17198 {
    private final Productionnull_17198 production = new Productionnull_17198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}