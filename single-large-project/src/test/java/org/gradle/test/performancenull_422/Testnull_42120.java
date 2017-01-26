package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42120 {
    private final Productionnull_42120 production = new Productionnull_42120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}