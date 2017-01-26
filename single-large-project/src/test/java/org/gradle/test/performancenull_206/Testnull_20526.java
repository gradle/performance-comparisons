package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20526 {
    private final Productionnull_20526 production = new Productionnull_20526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}