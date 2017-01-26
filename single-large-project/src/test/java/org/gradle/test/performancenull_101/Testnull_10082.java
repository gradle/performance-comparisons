package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10082 {
    private final Productionnull_10082 production = new Productionnull_10082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}