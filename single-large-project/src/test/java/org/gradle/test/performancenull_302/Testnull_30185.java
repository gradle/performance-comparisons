package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30185 {
    private final Productionnull_30185 production = new Productionnull_30185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}