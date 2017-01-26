package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30199 {
    private final Productionnull_30199 production = new Productionnull_30199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}