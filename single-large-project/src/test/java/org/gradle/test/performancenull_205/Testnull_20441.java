package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20441 {
    private final Productionnull_20441 production = new Productionnull_20441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}