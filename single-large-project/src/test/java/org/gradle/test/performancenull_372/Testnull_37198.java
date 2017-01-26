package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37198 {
    private final Productionnull_37198 production = new Productionnull_37198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}