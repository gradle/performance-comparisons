package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22028 {
    private final Productionnull_22028 production = new Productionnull_22028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}