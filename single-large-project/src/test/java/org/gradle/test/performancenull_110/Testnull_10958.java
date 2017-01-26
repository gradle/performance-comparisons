package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10958 {
    private final Productionnull_10958 production = new Productionnull_10958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}