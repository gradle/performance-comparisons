package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19969 {
    private final Productionnull_19969 production = new Productionnull_19969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}