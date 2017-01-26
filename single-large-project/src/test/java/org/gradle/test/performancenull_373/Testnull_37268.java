package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37268 {
    private final Productionnull_37268 production = new Productionnull_37268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}