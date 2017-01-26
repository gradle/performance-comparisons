package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40709 {
    private final Productionnull_40709 production = new Productionnull_40709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}