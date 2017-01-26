package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23060 {
    private final Productionnull_23060 production = new Productionnull_23060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}