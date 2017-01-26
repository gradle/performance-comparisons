package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42683 {
    private final Productionnull_42683 production = new Productionnull_42683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}