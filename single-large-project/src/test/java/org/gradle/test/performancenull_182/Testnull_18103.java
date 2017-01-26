package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18103 {
    private final Productionnull_18103 production = new Productionnull_18103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}