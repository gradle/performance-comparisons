package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23786 {
    private final Productionnull_23786 production = new Productionnull_23786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}