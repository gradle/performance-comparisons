package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12042 {
    private final Productionnull_12042 production = new Productionnull_12042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}