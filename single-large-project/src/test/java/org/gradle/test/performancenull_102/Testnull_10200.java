package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10200 {
    private final Productionnull_10200 production = new Productionnull_10200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}