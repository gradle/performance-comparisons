package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7443 {
    private final Productionnull_7443 production = new Productionnull_7443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}