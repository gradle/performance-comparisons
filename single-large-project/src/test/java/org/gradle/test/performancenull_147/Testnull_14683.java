package org.gradle.test.performancenull_147;

import static org.junit.Assert.*;

public class Testnull_14683 {
    private final Productionnull_14683 production = new Productionnull_14683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}