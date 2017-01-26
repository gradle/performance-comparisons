package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33190 {
    private final Productionnull_33190 production = new Productionnull_33190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}