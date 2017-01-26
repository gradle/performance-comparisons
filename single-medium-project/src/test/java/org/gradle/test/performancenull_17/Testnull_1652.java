package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1652 {
    private final Productionnull_1652 production = new Productionnull_1652("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}