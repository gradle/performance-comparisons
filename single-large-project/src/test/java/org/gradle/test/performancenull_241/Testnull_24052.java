package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24052 {
    private final Productionnull_24052 production = new Productionnull_24052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}