package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3598 {
    private final Productionnull_3598 production = new Productionnull_3598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}