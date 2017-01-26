package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30119 {
    private final Productionnull_30119 production = new Productionnull_30119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}