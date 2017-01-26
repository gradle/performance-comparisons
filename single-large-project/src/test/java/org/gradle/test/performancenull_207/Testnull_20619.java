package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20619 {
    private final Productionnull_20619 production = new Productionnull_20619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}