package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37475 {
    private final Productionnull_37475 production = new Productionnull_37475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}