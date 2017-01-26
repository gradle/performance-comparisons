package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21204 {
    private final Productionnull_21204 production = new Productionnull_21204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}