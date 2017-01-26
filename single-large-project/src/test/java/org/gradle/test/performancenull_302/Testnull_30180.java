package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30180 {
    private final Productionnull_30180 production = new Productionnull_30180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}