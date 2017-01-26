package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2052 {
    private final Productionnull_2052 production = new Productionnull_2052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}