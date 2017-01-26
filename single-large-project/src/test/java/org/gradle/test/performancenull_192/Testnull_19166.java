package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19166 {
    private final Productionnull_19166 production = new Productionnull_19166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}