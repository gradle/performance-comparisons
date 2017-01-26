package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30190 {
    private final Productionnull_30190 production = new Productionnull_30190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}