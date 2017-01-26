package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20643 {
    private final Productionnull_20643 production = new Productionnull_20643("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}