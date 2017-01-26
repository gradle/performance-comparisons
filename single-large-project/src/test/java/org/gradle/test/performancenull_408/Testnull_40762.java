package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40762 {
    private final Productionnull_40762 production = new Productionnull_40762("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}