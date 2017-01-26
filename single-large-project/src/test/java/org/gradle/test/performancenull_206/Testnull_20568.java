package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20568 {
    private final Productionnull_20568 production = new Productionnull_20568("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}