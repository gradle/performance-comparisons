package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25993 {
    private final Productionnull_25993 production = new Productionnull_25993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}