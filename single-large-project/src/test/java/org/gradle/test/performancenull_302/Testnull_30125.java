package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30125 {
    private final Productionnull_30125 production = new Productionnull_30125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}