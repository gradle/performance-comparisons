package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15003 {
    private final Productionnull_15003 production = new Productionnull_15003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}