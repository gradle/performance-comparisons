package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37125 {
    private final Productionnull_37125 production = new Productionnull_37125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}