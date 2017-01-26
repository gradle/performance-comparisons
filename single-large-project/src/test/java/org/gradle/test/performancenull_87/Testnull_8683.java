package org.gradle.test.performancenull_87;

import static org.junit.Assert.*;

public class Testnull_8683 {
    private final Productionnull_8683 production = new Productionnull_8683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}