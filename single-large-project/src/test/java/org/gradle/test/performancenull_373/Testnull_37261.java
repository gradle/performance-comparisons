package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37261 {
    private final Productionnull_37261 production = new Productionnull_37261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}