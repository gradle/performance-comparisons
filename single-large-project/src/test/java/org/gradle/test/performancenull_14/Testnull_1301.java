package org.gradle.test.performancenull_14;

import static org.junit.Assert.*;

public class Testnull_1301 {
    private final Productionnull_1301 production = new Productionnull_1301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}