package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34006 {
    private final Productionnull_34006 production = new Productionnull_34006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}