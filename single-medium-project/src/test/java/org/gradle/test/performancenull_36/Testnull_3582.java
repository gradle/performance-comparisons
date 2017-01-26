package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3582 {
    private final Productionnull_3582 production = new Productionnull_3582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}