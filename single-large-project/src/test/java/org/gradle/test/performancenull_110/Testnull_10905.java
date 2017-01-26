package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10905 {
    private final Productionnull_10905 production = new Productionnull_10905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}