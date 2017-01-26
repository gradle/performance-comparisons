package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1766 {
    private final Productionnull_1766 production = new Productionnull_1766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}