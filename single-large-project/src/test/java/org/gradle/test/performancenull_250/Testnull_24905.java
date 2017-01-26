package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24905 {
    private final Productionnull_24905 production = new Productionnull_24905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}