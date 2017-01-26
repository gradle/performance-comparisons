package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41169 {
    private final Productionnull_41169 production = new Productionnull_41169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}