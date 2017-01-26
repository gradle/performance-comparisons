package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2043 {
    private final Productionnull_2043 production = new Productionnull_2043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}