package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40187 {
    private final Productionnull_40187 production = new Productionnull_40187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}