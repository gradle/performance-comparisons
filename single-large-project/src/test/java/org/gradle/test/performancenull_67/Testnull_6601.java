package org.gradle.test.performancenull_67;

import static org.junit.Assert.*;

public class Testnull_6601 {
    private final Productionnull_6601 production = new Productionnull_6601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}