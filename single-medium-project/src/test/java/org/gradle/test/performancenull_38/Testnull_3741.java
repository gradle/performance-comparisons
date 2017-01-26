package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3741 {
    private final Productionnull_3741 production = new Productionnull_3741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}