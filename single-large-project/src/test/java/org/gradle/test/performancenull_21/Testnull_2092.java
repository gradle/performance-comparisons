package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2092 {
    private final Productionnull_2092 production = new Productionnull_2092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}