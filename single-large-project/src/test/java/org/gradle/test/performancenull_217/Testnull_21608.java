package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21608 {
    private final Productionnull_21608 production = new Productionnull_21608("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}