package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24783 {
    private final Productionnull_24783 production = new Productionnull_24783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}