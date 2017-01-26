package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33183 {
    private final Productionnull_33183 production = new Productionnull_33183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}