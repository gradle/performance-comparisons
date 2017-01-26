package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19104 {
    private final Productionnull_19104 production = new Productionnull_19104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}