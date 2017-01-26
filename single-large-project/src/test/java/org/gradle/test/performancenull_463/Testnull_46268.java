package org.gradle.test.performancenull_463;

import static org.junit.Assert.*;

public class Testnull_46268 {
    private final Productionnull_46268 production = new Productionnull_46268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}