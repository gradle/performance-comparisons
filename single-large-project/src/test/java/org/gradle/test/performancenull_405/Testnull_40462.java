package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40462 {
    private final Productionnull_40462 production = new Productionnull_40462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}