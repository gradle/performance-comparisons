package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40104 {
    private final Productionnull_40104 production = new Productionnull_40104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}