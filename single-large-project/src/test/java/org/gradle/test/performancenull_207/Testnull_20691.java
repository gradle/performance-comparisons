package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20691 {
    private final Productionnull_20691 production = new Productionnull_20691("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}