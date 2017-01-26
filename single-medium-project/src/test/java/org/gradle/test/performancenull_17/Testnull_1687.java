package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1687 {
    private final Productionnull_1687 production = new Productionnull_1687("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}