package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18060 {
    private final Productionnull_18060 production = new Productionnull_18060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}