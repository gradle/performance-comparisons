package org.gradle.test.performancenull_107;

import static org.junit.Assert.*;

public class Testnull_10683 {
    private final Productionnull_10683 production = new Productionnull_10683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}