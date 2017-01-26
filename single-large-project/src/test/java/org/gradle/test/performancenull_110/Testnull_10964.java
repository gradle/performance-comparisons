package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10964 {
    private final Productionnull_10964 production = new Productionnull_10964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}