package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8150 {
    private final Productionnull_8150 production = new Productionnull_8150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}