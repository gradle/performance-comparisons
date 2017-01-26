package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1788 {
    private final Productionnull_1788 production = new Productionnull_1788("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}