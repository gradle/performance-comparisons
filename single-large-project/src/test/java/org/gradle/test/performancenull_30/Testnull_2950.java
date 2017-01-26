package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2950 {
    private final Productionnull_2950 production = new Productionnull_2950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}