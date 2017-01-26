package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1913 {
    private final Productionnull_1913 production = new Productionnull_1913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}