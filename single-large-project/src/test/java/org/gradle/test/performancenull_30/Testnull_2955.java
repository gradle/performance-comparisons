package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2955 {
    private final Productionnull_2955 production = new Productionnull_2955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}