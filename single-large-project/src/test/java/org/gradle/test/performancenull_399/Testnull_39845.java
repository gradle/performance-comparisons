package org.gradle.test.performancenull_399;

import static org.junit.Assert.*;

public class Testnull_39845 {
    private final Productionnull_39845 production = new Productionnull_39845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}