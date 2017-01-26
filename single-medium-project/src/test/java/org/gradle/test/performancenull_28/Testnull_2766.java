package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2766 {
    private final Productionnull_2766 production = new Productionnull_2766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}