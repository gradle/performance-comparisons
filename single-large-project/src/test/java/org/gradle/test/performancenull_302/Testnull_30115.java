package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30115 {
    private final Productionnull_30115 production = new Productionnull_30115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}