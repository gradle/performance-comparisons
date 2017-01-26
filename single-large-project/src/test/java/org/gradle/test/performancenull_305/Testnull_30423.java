package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30423 {
    private final Productionnull_30423 production = new Productionnull_30423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}