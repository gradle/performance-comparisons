package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42836 {
    private final Productionnull_42836 production = new Productionnull_42836("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}