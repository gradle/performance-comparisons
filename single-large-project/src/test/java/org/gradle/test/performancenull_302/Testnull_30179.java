package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30179 {
    private final Productionnull_30179 production = new Productionnull_30179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}