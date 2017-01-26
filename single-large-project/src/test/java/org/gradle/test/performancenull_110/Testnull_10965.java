package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10965 {
    private final Productionnull_10965 production = new Productionnull_10965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}