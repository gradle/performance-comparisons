package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40749 {
    private final Productionnull_40749 production = new Productionnull_40749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}