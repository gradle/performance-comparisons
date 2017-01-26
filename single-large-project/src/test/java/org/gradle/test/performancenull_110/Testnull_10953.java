package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10953 {
    private final Productionnull_10953 production = new Productionnull_10953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}