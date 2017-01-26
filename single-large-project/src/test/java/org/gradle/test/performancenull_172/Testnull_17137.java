package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17137 {
    private final Productionnull_17137 production = new Productionnull_17137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}