package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49443 {
    private final Productionnull_49443 production = new Productionnull_49443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}