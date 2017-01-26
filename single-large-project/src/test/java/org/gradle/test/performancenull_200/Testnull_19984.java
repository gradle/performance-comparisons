package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19984 {
    private final Productionnull_19984 production = new Productionnull_19984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}