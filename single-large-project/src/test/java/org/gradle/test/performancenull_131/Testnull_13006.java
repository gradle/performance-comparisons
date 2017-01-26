package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13006 {
    private final Productionnull_13006 production = new Productionnull_13006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}