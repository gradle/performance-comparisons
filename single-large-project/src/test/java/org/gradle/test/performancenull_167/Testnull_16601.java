package org.gradle.test.performancenull_167;

import static org.junit.Assert.*;

public class Testnull_16601 {
    private final Productionnull_16601 production = new Productionnull_16601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}