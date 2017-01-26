package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30157 {
    private final Productionnull_30157 production = new Productionnull_30157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}