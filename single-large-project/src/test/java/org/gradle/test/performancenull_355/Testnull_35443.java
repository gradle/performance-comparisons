package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35443 {
    private final Productionnull_35443 production = new Productionnull_35443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}