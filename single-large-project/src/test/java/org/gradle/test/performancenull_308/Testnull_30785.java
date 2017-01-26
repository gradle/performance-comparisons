package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30785 {
    private final Productionnull_30785 production = new Productionnull_30785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}