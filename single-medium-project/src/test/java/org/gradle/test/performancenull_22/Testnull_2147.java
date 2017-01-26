package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2147 {
    private final Productionnull_2147 production = new Productionnull_2147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}