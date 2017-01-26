package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37457 {
    private final Productionnull_37457 production = new Productionnull_37457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}