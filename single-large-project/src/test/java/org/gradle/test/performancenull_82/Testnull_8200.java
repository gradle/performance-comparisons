package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8200 {
    private final Productionnull_8200 production = new Productionnull_8200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}