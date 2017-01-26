package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1733 {
    private final Productionnull_1733 production = new Productionnull_1733("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}