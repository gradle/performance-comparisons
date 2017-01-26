package org.gradle.test.performancenull_29;

import static org.junit.Assert.*;

public class Testnull_2843 {
    private final Productionnull_2843 production = new Productionnull_2843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}