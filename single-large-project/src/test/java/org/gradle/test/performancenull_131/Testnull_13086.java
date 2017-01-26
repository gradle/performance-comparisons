package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13086 {
    private final Productionnull_13086 production = new Productionnull_13086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}