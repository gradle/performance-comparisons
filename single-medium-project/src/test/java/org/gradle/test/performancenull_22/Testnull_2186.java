package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2186 {
    private final Productionnull_2186 production = new Productionnull_2186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}