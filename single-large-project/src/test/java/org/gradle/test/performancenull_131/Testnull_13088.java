package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13088 {
    private final Productionnull_13088 production = new Productionnull_13088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}