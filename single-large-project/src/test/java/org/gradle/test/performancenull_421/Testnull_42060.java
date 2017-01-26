package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42060 {
    private final Productionnull_42060 production = new Productionnull_42060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}