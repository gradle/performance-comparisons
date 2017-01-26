package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1710 {
    private final Productionnull_1710 production = new Productionnull_1710("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}