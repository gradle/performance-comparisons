package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18603 {
    private final Productionnull_18603 production = new Productionnull_18603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}