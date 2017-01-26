package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24283 {
    private final Productionnull_24283 production = new Productionnull_24283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}