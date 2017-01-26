package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40769 {
    private final Productionnull_40769 production = new Productionnull_40769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}