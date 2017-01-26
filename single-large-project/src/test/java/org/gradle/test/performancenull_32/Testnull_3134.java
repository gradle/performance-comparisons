package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3134 {
    private final Productionnull_3134 production = new Productionnull_3134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}