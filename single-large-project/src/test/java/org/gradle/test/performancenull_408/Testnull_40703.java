package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40703 {
    private final Productionnull_40703 production = new Productionnull_40703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}