package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6462 {
    private final Productionnull_6462 production = new Productionnull_6462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}