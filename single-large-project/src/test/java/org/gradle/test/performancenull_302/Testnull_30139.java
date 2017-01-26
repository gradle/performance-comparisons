package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30139 {
    private final Productionnull_30139 production = new Productionnull_30139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}