package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49964 {
    private final Productionnull_49964 production = new Productionnull_49964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}