package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1743 {
    private final Productionnull_1743 production = new Productionnull_1743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}