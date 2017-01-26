package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40742 {
    private final Productionnull_40742 production = new Productionnull_40742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}