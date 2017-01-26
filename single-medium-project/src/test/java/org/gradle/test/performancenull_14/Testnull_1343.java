package org.gradle.test.performancenull_14;

import static org.junit.Assert.*;

public class Testnull_1343 {
    private final Productionnull_1343 production = new Productionnull_1343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}