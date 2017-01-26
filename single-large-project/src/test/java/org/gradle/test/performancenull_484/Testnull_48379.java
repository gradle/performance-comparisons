package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48379 {
    private final Productionnull_48379 production = new Productionnull_48379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}