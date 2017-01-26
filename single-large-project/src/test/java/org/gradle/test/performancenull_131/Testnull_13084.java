package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13084 {
    private final Productionnull_13084 production = new Productionnull_13084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}