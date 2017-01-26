package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23050 {
    private final Productionnull_23050 production = new Productionnull_23050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}