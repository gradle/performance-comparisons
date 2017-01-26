package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21926 {
    private final Productionnull_21926 production = new Productionnull_21926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}