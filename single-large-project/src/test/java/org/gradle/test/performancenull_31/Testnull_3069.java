package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3069 {
    private final Productionnull_3069 production = new Productionnull_3069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}