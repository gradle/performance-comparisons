package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32965 {
    private final Productionnull_32965 production = new Productionnull_32965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}