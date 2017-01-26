package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11783 {
    private final Productionnull_11783 production = new Productionnull_11783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}